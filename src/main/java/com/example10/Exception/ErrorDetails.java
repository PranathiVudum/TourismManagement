package com.example10.Exception;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails
{
	public ErrorDetails(Date date, String message, String description) {
		// TODO Auto-generated constructor stub
	}
	@NotNull
	private Date timeStamp;
	@NotNull
	private String mesage;
	@NotNull
	private String details;//api uri
}