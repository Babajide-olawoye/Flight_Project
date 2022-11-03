package com.airline.project.Airline_Project.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = "/test/all/{num}", method = RequestMethod.GET)
	public Flight getFlight(@PathVariable int num){
		return flightService.getFlights().get(num);
	}

	@RequestMapping(value = "/{departure}", method = RequestMethod.GET)
	public List <Flight> getFlights(@PathVariable String departure){

		return flightService.getFlights(departure);
	}
	
	@RequestMapping(value = "/test/{departure}/{num}", method = RequestMethod.GET)
	public Flight getFlights(@PathVariable String departure, @PathVariable int num){

		return flightService.getFlights(departure).get(num);
	}
	
	@RequestMapping(value = "/{departure}/{arrival}", method = RequestMethod.GET)
	public List <Flight> getFlights(@PathVariable String departure, @PathVariable String arrival){

		return flightService.getFlights(departure, arrival);
	}
	
	@RequestMapping(value = "/test/{departure}/{arrival}/{num}", method = RequestMethod.GET)
	public Flight getFlights(@PathVariable String departure, @PathVariable String arrival, @PathVariable int num){
		return flightService.getFlights(departure, arrival).get(num);
	}
	
	
	@RequestMapping(value = "/{departure}/options", method = RequestMethod.GET)
	public List <String> getFlightOption(@PathVariable String departure){

		return flightService.getFlightOptions(departure);
	}
	
	@RequestMapping(value = "/test/{departure}/option/{num}", method = RequestMethod.GET)
	public String getFlightOption(@PathVariable String departure, @PathVariable int num){
		return flightService.getFlightOptions(departure).get(num);
	}
	
	
}
