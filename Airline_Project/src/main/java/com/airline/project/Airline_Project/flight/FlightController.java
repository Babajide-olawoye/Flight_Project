package com.airline.project.Airline_Project.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/flight")
public class FlightController {

	private final FlightService flightService;
	
	@Autowired
	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@GetMapping
	public List <Flight> getFlights(){
		return flightService.getFlights();
	}
}
