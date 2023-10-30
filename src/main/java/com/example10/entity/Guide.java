package com.example10.entity;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guide extends Location{
	
	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String address;
	@Column(unique = true)
	private String phNo;
	@NotNull
	private boolean status=Boolean.TRUE;
	
	//one Guide can be assigned to many customers
	@OneToMany(mappedBy = "guide",cascade = CascadeType.PERSIST) //guide id will be foreign key
	@JsonIgnoreProperties("guide")
	List<Customer> customers;//in customer table

	public void setCustomers(List<Customer> customers2) {
		// TODO Auto-generated method stub
		
	}
	}
//guide_id