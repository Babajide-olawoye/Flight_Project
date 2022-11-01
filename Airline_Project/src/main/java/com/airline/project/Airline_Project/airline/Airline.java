package com.airline.project.Airline_Project.airline;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.airline.project.Airline_Project.flight.Flight;

public class Airline {
	
	private long id;
	private String airlineName;
	private int luggagePrice;
	List<Flight> flights;
	private Airline(long id, String airlineName, int luggagePrice, List<Flight> flights) {
		super();
		this.id = id;
		this.airlineName = airlineName;
		this.luggagePrice = luggagePrice;
		setFlights(flights);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public int getLuggagePrice() {
		return luggagePrice;
	}
	public void setLuggagePrice(int luggagePrice) {
		this.luggagePrice = luggagePrice;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	
	private void setFlights(List<Flight> flights) {
		List<Flight> airLines = new ArrayList<>();
		for (Flight flight: flights) {
			if(flight.getAirline().equals(this.airlineName)) {
				airLines.add(flight);
			}
		}
		this.flights = airLines;
	}
	
	
	
	

}
