package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TvRespository;
import com.example.demo.model.TV;

@Service
public class TvService {
	@Autowired
	private TvRespository TvRepository;

	public Iterable<TV> findAll() {
		// TODO Auto-generated method stub
		return TvRepository.findAll();
	}

	public Optional<TV> findbyid(int id) {
		// TODO Auto-generated method stub
		return TvRepository.findById(id);
	}

	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		TvRepository.deleteById(id);
		return true;
	}

	public TV update(TV a) {
		// TODO Auto-generated method stub
		return TvRepository.save(a);
	}

	public TV create(TV a) {
		// TODO Auto-generated method stub
		return TvRepository.save(a);
	}

}