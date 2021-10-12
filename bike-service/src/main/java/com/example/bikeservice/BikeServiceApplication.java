package com.example.bikeservice;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BikeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeServiceApplication.class, args);
	}


	@Bean
	ApplicationRunner init(BikeRepository repository) {
		return args -> {
			repository.deleteAll();
			Stream.of("Merida", "Trek", "Specialized", "Cannondale", "Kona",
					"Scott", "Santa Cruz", "Marin", "GT", "Giant").forEach(name -> {
				repository.save(new Bike(name));
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
