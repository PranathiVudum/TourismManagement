package com.example10.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Location")
@Inheritance(strategy=InheritanceType.JOINED)
public class Location
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer Id;
   @Column(length=30)
   private String LocationName;
   @Column(length=30)
   private String Email;
public String getEmail() {
	// TODO Auto-generated method stub
	return null;
}
public String getLocationName() {
	// TODO Auto-generated method stub
	return null;
}
   
}