package com.example10.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example10.entity.Location;

public interface LocationRepository extends JpaRepository<Location,Integer> {
	
	
	Location findByLocationNameAndEmail(String LocationName, String Email);
	
	}


