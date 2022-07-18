package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Radio;
import com.example.demo.model.TV;



@Repository
public interface RadioRespository extends JpaRepository<Radio,Integer> {
	
	
}
