package com.example10.ServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example10.Repository.LocationRepository;
import com.example10.Service.LocationService;
import com.example10.entity.Location;

@Service
public class LocationServiceImple implements LocationService{


	@Autowired
	private LocationRepository locationRepository;
	
	
	@Override
	public Location login(String LocationName, String Email) 
	{
		 Location location=locationRepository.findByLocationNameAndEmail(LocationName, Email);
		 return location;
	}
	}

