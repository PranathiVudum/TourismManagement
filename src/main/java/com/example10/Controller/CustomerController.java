package com.example10.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example10.Service.GuideService;
import com.example10.Util.Converter;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private GuideService guideService;
	
	CustomerController(Converter converter) {
    }
	
	
	@PostMapping("/assignment/{gid}/{cid}")
	public String assignCustomerToGuide(@PathVariable("gid") int gid,
			@PathVariable("cid") int cid)
	{
		return guideService.assignCustomerToGuide(gid, cid);
	}
	}




