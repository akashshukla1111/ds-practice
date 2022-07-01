package com.practice.geeksforgeeks.hashing;

import java.util.*;

public class ItineraryTickets {

	// http://www.geeksforgeeks.org/find-itinerary-from-a-given-list-of-tickets/

	public String findItineraryTickets(Map<String,String> dataSet) {
		String start = null;
		for (Map.Entry key : dataSet.entrySet()) {
			String k =(String) key.getKey();
			if (!dataSet.containsKey(k)) {
				start = k;
				break;
			}
		}
			if (Objects.nonNull(start)){
				String result=start+"->"+dataSet.get(start);
				String stVal=dataSet.get(start);
				while (dataSet.get(stVal)!=null){
					result=result+","+stVal+"=>"+dataSet.get(stVal);
					stVal=dataSet.get(stVal);
				}
				return result;
			}
			return start;
		}
	}
