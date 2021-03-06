package com.example.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController
{

	private CarRepository carRepository;

	@Autowired
	public CarController(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@GetMapping("/message")
	public String test() {
		return "Hello This is from the car-service";
	}

	@GetMapping("/all-cars")
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}
}
