package com.practice.geeksforgeeks.hashing;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ItineraryTicketsTest {

	@Test
	public void ItinerayTicketsTest() throws Exception {
		Map<String, String> dataSet = new HashMap();
		dataSet.put("Chennai", "Banglore");
		dataSet.put("Bombay", "Delhi");
		dataSet.put("Goa", "Chennai");
		dataSet.put("Delhi", "Goa");
		System.out.println(dataSet);
		ItineraryTickets test= new ItineraryTickets();
		System.out.println(test.findItineraryTickets(dataSet));




	}
}