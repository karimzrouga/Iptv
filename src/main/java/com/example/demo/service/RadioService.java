package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.RadioRespository;
import com.example.demo.model.Radio;

@Service
public class RadioService {
	@Autowired
	private RadioRespository RadioRepository;

	public Iterable<Radio> findAll() {
		// TODO Auto-generated method stub
		return RadioRepository.findAll();
	}

	public Optional<Radio> findbyid(int id) {
		// TODO Auto-generated method stub
		return RadioRepository.findById(id);
	}

	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		RadioRepository.deleteById(id);
		return true;
	}

	public Radio update(Radio a) {
		// TODO Auto-generated method stub
		return RadioRepository.save(a);
	}

	public Radio create(Radio a) {
		// TODO Auto-generated method stub
		return RadioRepository.save(a);
	}

}