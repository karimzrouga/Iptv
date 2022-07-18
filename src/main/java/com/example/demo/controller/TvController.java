package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TV;

@RestController
@RequestMapping("/api/TV/")
@CrossOrigin(origins = "*")
public class TvController {
	@Autowired
	private com.example.demo.service.TvService TVService;

	@GetMapping(path = "all")
	public Iterable<TV> TVs() {
		return TVService.findAll();
	}

	@GetMapping(path = "{id}")
	public TV find(@PathVariable int id) {
		return TVService.findbyid(id).get();
	}

	@PostMapping(path = "add")
	public TV addTV(@RequestBody TV p) {

		return TVService.create(p);
	}

	@DeleteMapping("/{id}")
	public void deleteTV(@PathVariable int id) {
		TVService.Delete(id);

	}

}
