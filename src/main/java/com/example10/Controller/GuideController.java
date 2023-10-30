package com.example10.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example10.DTO.GuideDTO;
import com.example10.Service.GuideService;
import com.example10.Util.Converter;
import com.example10.entity.Guide;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api")
public class GuideController
{
	@Autowired
	private GuideService guideService;
	
	@Autowired
	private Converter converter;
	
	@PostMapping("/createGuide")	
	 ResponseEntity<GuideDTO> registerGuide(@Valid @RequestBody GuideDTO guideDTO)	
	 {
		final Guide guide=converter.convertToGuideEntity(guideDTO);
		return new ResponseEntity<GuideDTO>(guideService.registerGuide(guide),HttpStatus.CREATED); 
	 }
}