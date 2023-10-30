package com.example10.DTO;


import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LocationDTO {
	@NotNull
	private Integer LocationId;
	   @NotNull
	   private String LocationName;
	   @NotNull
	   private String Email;
	

}
