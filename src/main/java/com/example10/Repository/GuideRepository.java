package com.example10.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example10.entity.Guide;

public interface GuideRepository extends JpaRepository <Guide,Integer> {

}
