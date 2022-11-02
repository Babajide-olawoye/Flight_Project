package com.test.airline.proj;


import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matcher.equalTo;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.airline.proj.pojo.Flight;

public class TestContols {
	Response response;
	@BeforeTest
	public void testAPI() {
		RestAssured.baseURI = "http://localhost:8081/api/v1/flight/";
		
	}
	
	@Test
	public void getAllFlight() {
		response = given().when().get("all");
		String res = response.then().extract().response().asString();
		JsonPath js = new JsonPath(res);
		int actualSize = js.getInt("fligh.size()");
		int perdictedSize = 48;
		int actualStatusCode = response.getStatusCode();
		int perdictedStatCode = 200;
		
		assertEquals(actualStatusCode, perdictedStatCode);
		assertEquals(actualSize, perdictedSize);
	}
	
	@Test//Get all flight based on departure city
	public void getFlight_Departure() {
		response = given().when().get("/Seville");
		String res = response.then().extract().response().asString();
		JsonPath js = new JsonPath(res);
		int actualSize = js.getInt("flight.size()");
		int perdictedSize = 9;
		int actualStatusCode = response.getStatusCode();
		int perdictedStatCode = 200;
		System.out.println(js.get().toString());
		
		
		assertEquals(actualStatusCode, perdictedStatCode);
		assertEquals(actualSize, perdictedSize);
	}
	
	@Test//Test to see that only departure city is Seville
	public void getFlight_Departure_OnlySelectedCity() {
		String res = given().when().get("/Seville").then().extract().response().asString();
		JsonPath js = new JsonPath(res);
		int size = js.getInt("flight.size()");
		boolean otherOrigin = false;
			
		
		for(int i = 0; i < size; i++) {
			Flight flight =  given().when().get("/test/Seville/"+i).as(Flight.class);
			if(!flight.getOrigin().equals("Seville")) {
				otherOrigin = true;
			}
		}
		
		assertEquals(otherOrigin, false);	
	}
	
	@Test//Test to see that only departure city is Seville and arrival city is London
	public void getFlight_Departure_Arrival() {
		String res = given().when().get("/Seville/London").then().extract().response().asString();
		JsonPath js = new JsonPath(res);
		int size = js.getInt("flight.size()");
		boolean otherOrigin = false;
			
		
		for(int i = 0; i < size; i++) {
			Flight flight =  given().when().get("/test/Seville/London/"+i).as(Flight.class);
			if(!flight.getOrigin().equals("Seville") && !flight.getDestination().equals("London")) {
				otherOrigin = true;
			}
		}
		
		assertEquals(otherOrigin, false);	
	}
	
	
}