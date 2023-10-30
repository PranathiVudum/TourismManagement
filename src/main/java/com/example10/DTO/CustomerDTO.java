package com.example10.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example10.entity.Guide;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerDTO {
	@NotNull
	@Size(min=3,max=50,message = "Name should have min 2 to max 50 characters")
	private String name;
	@NotNull
	@Size(min=5,max=100,message = "Name should have min 2 to max 50 characters")
	private String address;
	@NotNull
	private String phNo;
	@NotNull
	private Guide guide;
}
