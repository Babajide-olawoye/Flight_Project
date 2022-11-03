package com.airline.project.Airline_Project.flight;

import java.util.ArrayList;
import java.util.HashMap;
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

	// Fetching allflights from database
	public List<Flight> getFlights() {
		return flightRepository.findAll();
	}

	// Get all flight that departure from departure city
	public List<Flight> getFlights(String departureCity) {
		List<Flight> destination = new ArrayList<>();

		for (Flight flight : flightRepository.findAll()) {
			String departedCity = flight.getOrigin();
			if (departedCity.equals(departureCity)) {
				destination.add(flight);
			}
		}
		return destination;
	}

	// Get all flight that departure from departure city and arrive at arrival city
	public List<Flight> getFlights(String departureCity, String arrivalCity) {
		List<Flight> destination = new ArrayList<>();

		for (Flight flight : flightRepository.findAll()) {
			String departedCity = flight.getOrigin();
			String arrCity = flight.getDestination();
			if (departedCity.equals(departureCity) && arrCity.equals(arrivalCity)) {
				destination.add(flight);
			}
		}
		return destination;
	}
	
	//Get list of destination option based on departure city
	public List<String> getFlightOptions(String departureCity){
		List< String> flightOption = new ArrayList<>();
		for(Flight flight: getFlights(departureCity)) {
			if(!flightOption.contains(flight.getDestination())) {
				flightOption.add(flight.getDestination());
			}
		}
		
		return flightOption;
	}

}
