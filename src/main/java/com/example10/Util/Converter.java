package com.example10.Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example10.DTO.CustomerDTO;
import com.example10.DTO.GuideDTO;
import com.example10.entity.Customer;
import com.example10.entity.Guide;
@Component
public class Converter {

	
	
	public  Customer convertToCustomerEntity(CustomerDTO customerDTO)
	{
		Customer customer=new Customer();
		if(customerDTO!=null)
		{
			BeanUtils.copyProperties(customerDTO, customer);
		}
	     return customer;
	}

	//convert from Entity to DTO
	public CustomerDTO convertToCustomerDTO(Customer customer)
	{
		CustomerDTO customerDTO=new CustomerDTO();
		if(customer!=null)
		{
			BeanUtils.copyProperties(customer, customerDTO);
		}
		return customerDTO;
	}



	//convert from DTO to Entity

	public  Guide convertToGuideEntity(GuideDTO guideDTO)
	{
		Guide guide=new Guide();
		if(guideDTO!=null)
		{
			BeanUtils.copyProperties(guideDTO, guide);
		}
	     return guide;
	}

	//convert from Entity to DTO
	public GuideDTO convertToGuideDTO(Guide guide)
	{
		GuideDTO guideDTO=new GuideDTO();
		if(guide!=null)
		{
			BeanUtils.copyProperties(guide, guideDTO);
		}
		return guideDTO;
	}
}
