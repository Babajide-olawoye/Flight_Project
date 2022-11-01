package com.airline.project.Airline_Project.flight;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Flight {
	
	@Id
	@SequenceGenerator(
			name="flight_sequence",
			sequenceName = "users_sequence",
			allocationSize= 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "flight_sequence"
			)
	
	private long id;
	private String origin;
	private String destination;
	private int price;
	private String AirlineId;
	
	public Flight() {
	}

	public Flight(long id, String origin, String destination, int price, String airlineId) {
		super();
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		AirlineId = airlineId;
	}

	public Flight(String origin, String destination, int price, String airlineId) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		AirlineId = airlineId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAirlineId() {
		return AirlineId;
	}

	public void setAirlineId(String airlineId) {
		AirlineId = airlineId;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", origin=" + origin + ", destination=" + destination + ", price=" + price
				+ ", AirlineId=" + AirlineId + "]";
	}
	

}
