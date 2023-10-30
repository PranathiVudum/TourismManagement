package com.example10.Service;


import com.example10.entity.Guide;
import com.example10.DTO.GuideDTO;

public interface GuideService
{
	GuideDTO	registerTeacher(Guide guide);
	String assignCustomerToGuide(int gid,int cid);
	GuideDTO registerGuide(Guide guide);
}