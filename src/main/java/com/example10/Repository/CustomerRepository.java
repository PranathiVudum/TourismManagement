package com.example10.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example10.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer>{

}
