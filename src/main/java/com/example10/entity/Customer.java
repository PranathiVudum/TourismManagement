package com.example10.entity;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Location
{
	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String address;
	@Column(unique = true)
	private String phNo;
	@NotNull
	private boolean status=Boolean.TRUE;

	//many Customer -one Guide
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "gId")
	@JsonIgnoreProperties("customers")
	private Guide guide;

	public String getLocationName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLocationName(Object locationName) {
		// TODO Auto-generated method stub
		
	}

	public void setGuide(Guide g) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	public Object getPhNo() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(Object address2) {
		// TODO Auto-generated method stub
		
	}

	public void setPhNo(Object phNo2) {
		// TODO Auto-generated method stub
		
	}
}