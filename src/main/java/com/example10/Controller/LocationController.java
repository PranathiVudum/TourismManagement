package com.example10.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example10.entity.Location;
import com.example10.Service.LocationService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;


@RestController
@RequestMapping("/location")
public class LocationController
{
	@Autowired
    private LocationService locationService;
	
	@PostMapping("/login")
	public String validate(@RequestBody Location location) throws ServletException
	{
		String jwtToken="";
		if(location.getLocationName()==null || location.getEmail()==null)
		{
			throw new ServletException("Please fill in Locationname and email");
		}
		String LocationName=location.getLocationName();
		String Email=location.getEmail();
		location=locationService.login(LocationName, Email);
		
		if(location==null)
		{
			throw new ServletRequestBindingException("Location not found");
		}
jwtToken= Jwts.builder().setSubject(LocationName).claim("location",location.getLocationName()).setIssuedAt(new Date()).
		signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		return jwtToken;
	}
	
}