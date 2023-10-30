package com.example10.Service;

import java.util.List;

import com.example10.DTO.CustomerDTO;
import com.example10.entity.Customer;

public interface CustomerService {

	CustomerDTO createCustomer(Customer customer);
	List<CustomerDTO> getAllCustomers();
	CustomerDTO getCustomerById(int id);
	CustomerDTO updateCustomer(int id,Customer customer);
	String deleteCustomer(int id);

}



