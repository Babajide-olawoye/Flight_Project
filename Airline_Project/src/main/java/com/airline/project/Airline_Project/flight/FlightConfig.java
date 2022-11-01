package com.airline.project.Airline_Project.flight;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlightConfig {
	
	@Bean
	CommandLineRunner commandLineRunner (FlightRepository repository) {
		return args ->{
			Flight seville = new Flight("Seville", "Dublin", 350, "TL1236");
			
			repository.saveAll(
					List.of(seville)
					);
		};
	}

}
