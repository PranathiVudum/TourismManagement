package com.example10.ServiceImple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example10.DTO.CustomerDTO;
import com.example10.Exception.ResourceNotFoundException;
import com.example10.Repository.CustomerRepository;
import com.example10.Service.CustomerService;
import com.example10.Util.Converter;
import com.example10.entity.Customer;


@Service

public class CustomerServiceImple implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private Converter converter;

	
	
	@Override
	public CustomerDTO createCustomer(Customer customer) {
		customer.setLocationName(customer.getLocationName());
		customer.setEmail(customer.getEmail());
		Customer cust=customerRepository.save(customer);
		return converter.convertToCustomerDTO(cust);
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		List<Customer> customers=customerRepository.findAll();
		
		//list of type DTO
		List<CustomerDTO> dtoList=new ArrayList<>();
		for(Customer c:customers)
		{
			dtoList.add(converter.convertToCustomerDTO(c));
		}
		
		return dtoList;
	}

	@Override
	public CustomerDTO getCustomerById(int id) {
		Customer c=customerRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Customer", "Id", id));
		return converter.convertToCustomerDTO(c);
	}

	@Override
	public CustomerDTO updateCustomer(int id, Customer customer) {
		Customer c=customerRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Customer", "Id", id));
		c.setName(customer.getName());
		c.setAddress(customer.getAddress());
		c.setPhNo(customer.getPhNo());
		
		Customer cust=customerRepository.save(c);
		return converter.convertToCustomerDTO(cust);
	}

	@Override
	public String deleteCustomer(int id) {
		customerRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Customer", "Id", id));
		
		customerRepository.deleteById(id);
		return "Customers got deleted successfully!!";
				
	}
}
