package com.airline.project.Airline_Project.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/flight")
public class FlightController {

	private final FlightService flightService;
	
	@Autowired
	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}
	
	//Returns all flight in db
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List <Flight> getFlights(){
		return flightService.getFlights();
	}
	
	@RequestMapping(value = "/{departure}", method = RequestMethod.GET)
	public List <Flight> getFlights(@PathVariable String departure){
		System.out.println("In here 1");
		return flightService.getFlights(departure);
	}
	
	@RequestMapping(value = "/{departure}/{arrival}", method = RequestMethod.GET)
	public List <Flight> getFlights(@PathVariable String departure, @PathVariable String arrival){
		System.out.println("In here");
		return flightService.getFlights(departure, arrival);
	}
	
}
