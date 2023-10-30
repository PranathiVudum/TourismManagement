package com.example10.ServiceImple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example10.DTO.GuideDTO;
import com.example10.Exception.ResourceNotFoundException;
import com.example10.Repository.CustomerRepository;
import com.example10.Repository.GuideRepository;
import com.example10.Service.GuideService;
import com.example10.Util.Converter;
import com.example10.entity.Customer;
import com.example10.entity.Guide;



@Service

public class GuideServiceImple implements GuideService{

	@Autowired
	private GuideRepository guideRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private Converter converter;
	
	@Override
	public GuideDTO registerGuide(Guide guide) {
	
		return converter.convertToGuideDTO(guideRepository.save(guide));
	}

	@Override
	public String assignCustomerToGuide(int gid, int cid) {
		Customer c=customerRepository.findById(cid).orElseThrow(()->
		new ResourceNotFoundException("Customer", "Id", cid));
		
		Guide  g=guideRepository.findById(gid).orElseThrow(()->
		new ResourceNotFoundException("Guide", "Id", gid));
		
		List<Customer> customers=new ArrayList<>();
		customers.add(c);
		
		//assign customers to guide
		g.setCustomers(customers);
		
		//assign guide to teacher
		c.setGuide(g);
		
		guideRepository.save(g);
		return "Customers assigned to guide successfully";
	}

	@Override
	public GuideDTO registerTeacher(Guide guide) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
