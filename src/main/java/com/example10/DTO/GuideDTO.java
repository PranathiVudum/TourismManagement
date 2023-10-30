package com.example10.DTO;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.example10.entity.Customer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuideDTO {
	@NotNull
	 private String name;
		@NotNull
		private String address;
		@NotNull
		private String phNo;
		@NotNull
		private boolean status=Boolean.TRUE;
		

		List<Customer> customers;

}
