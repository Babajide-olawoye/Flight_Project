package com.airline.project.Airline_Project.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	
	private final FlightRepository flightRepository;
	
	@Autowired
	public FlightService(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	//Fetching flights from database
	public List <Flight> getFlights(){
		return flightRepository.findAll();
	}
}
