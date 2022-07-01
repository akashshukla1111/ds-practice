package com.practice.mics;

import java.util.Date;

public final class FinalClassExample {

	private final int id;
	
	private final String name;
	
//	private final HashMap<String,String> testMap;
	private final Date date;
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	/**
	 * Accessor function for mutable objects
	 */
//	public HashMap<String, String> getTestMap() {
//		//return testMap;
//		return (HashMap<String, String>) testMap.clone();
//	}

	public Date getDate() {
		return date;
	}

	/**
	 * Constructor performing Deep Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
	
//	public FinalClassExample(int i, String n, HashMap<String,String> hm){
//		System.out.println("Performing Deep Copy for Object initialization");
//		this.id=i;
//		this.name=n;
//		HashMap<String,String> tempMap=new HashMap<String,String>();
//		String key;
//		Iterator<String> it = hm.keySet().iterator();
//		while(it.hasNext()){
//			key=it.next();
//			tempMap.put(key, hm.get(key));
//		}
//		this.testMap=tempMap;
//	}
	
	
	/**
	 * Constructor performing Shallow Copy
	 * @param i
	 * @param n
	 * @param hm
	 */

	public FinalClassExample(int i, String n, Date date){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.date= (Date) date;
	}

	
	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
	 * @param args
	 */
	public static void main(String[] args) {
//		HashMap<String, String> h1 = new HashMap<String,String>();
//		h1.put("1", "first");
//		h1.put("2", "second");
//
				String s = "original";

		Date d=new Date();
		int i=10;
		
		FinalClassExample ce = new FinalClassExample(i,s,d);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==ce.getName());
		System.out.println(d == ce.getDate());
		//print the ce values
		System.out.println("ce id:"+ce.getId());
		System.out.println("ce name:"+ce.getName());
		System.out.println("ce testMap:"+ce.getDate());
		//change the local variable values
		i=20;
		s="modified";
		d.setTime(4567);
		//print the values again
		System.out.println("ce id after local variable change:"+ce.getId());
		System.out.println("ce name after local variable change:"+ce.getName());
		System.out.println("ce testMap after local variable change:"+ce.getDate());
		
		Date dt = ce.getDate();

		d.setTime(5678);
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.getDate());

	}

}