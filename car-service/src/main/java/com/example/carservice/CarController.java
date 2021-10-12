package com.example.carservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in First Service";
	}
}
