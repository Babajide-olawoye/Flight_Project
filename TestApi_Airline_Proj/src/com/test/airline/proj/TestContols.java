package com.test.airline.proj;


import io.restassured.RestAssured;
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
		System.out.println(actualSize);
		assertEquals(actualStatusCode, perdictedStatCode);
		assertEquals(actualSize, perdictedSize);
	}
	
	@Test//Get all flight based on departure city
	public void getFlight_Departure_OnlySelectedCity() {
		response = given().when().get("/Seville");
		String res = response.then().extract().response().asString();
		JsonPath js = new JsonPath(res);
		int count = js.getInt("flight.length");
		

		
		String rand = js.toString();
		
		System.out.println(rand);
		
	}
	
}