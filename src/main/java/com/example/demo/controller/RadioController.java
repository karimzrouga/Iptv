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

import com.example.demo.model.Radio;

@RestController
@RequestMapping("/api/Radio/")
@CrossOrigin(origins = "*")
public class RadioController {
	@Autowired
	private com.example.demo.service.RadioService RadioService;

	@GetMapping(path = "all")
	public Iterable<Radio> Radios() {
		return RadioService.findAll();
	}

	@GetMapping(path = "{id}")
	public Radio find(@PathVariable int id) {
		return RadioService.findbyid(id).get();
	}

	@PostMapping(path = "/add")
	public Radio addRadio(@RequestBody Radio p) {

		return RadioService.create(this.RadioService.findbyid(p.getId()).get());
	}

	@DeleteMapping("/{id}")
	public void deleteRadio(@PathVariable int id) {
		RadioService.Delete(id);

	}

}
