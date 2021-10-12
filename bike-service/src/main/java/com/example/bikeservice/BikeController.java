package com.example.bikeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class BikeController
{

	private BikeRepository bikeRepository;

	@Autowired
	public BikeController(BikeRepository bikeRepository) {
		this.bikeRepository = bikeRepository;
	}

	@GetMapping("/message")
	public String test() {
		return "Hello This is from the bike-service";
	}

	@GetMapping("/all-bikes")
	public List<Bike> getAllCars() {
		return bikeRepository.findAll();
	}
}
