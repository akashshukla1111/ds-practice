package com.practice.mics;

import java.util.Comparator;

class TreeSet {
	static java.util.TreeSet<StringBuffer> t ;
	public static void main(String[] args) {

		 t = new java.util.TreeSet<>(new Comparator<StringBuffer>() {

			@Override
			public int compare(StringBuffer o1, StringBuffer o2) {

				return o2.toString().compareTo(o1.toString());
			}
		});
		
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("b"));
		t.add(new StringBuffer("c"));
		t.add(new StringBuffer("d"));

		System.out.println(t);
		
		

	}
	public String toString(){
		return "hello"+t;
	}
}
