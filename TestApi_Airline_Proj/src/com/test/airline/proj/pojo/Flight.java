package com.test.airline.proj.pojo;

public class Flight {

	private long flight_id;
	private String flight_no;
	private String origin;
	private String destination;
	private String airline;
	private double price;
	private String fly_out_time;
	private String flight_duration;


	public long getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(long flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
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

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getFly_out_time() {
		return fly_out_time;
	}

	public void setFly_out_time(String fly_out_time) {
		this.fly_out_time = fly_out_time;
	}

	public String getFlight_duration() {
		return flight_duration;
	}

	public void setFlight_duration(String flight_duration) {
		this.flight_duration = flight_duration;
	}

	
}
