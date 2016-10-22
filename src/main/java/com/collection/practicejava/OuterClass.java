package com.collection.practicejava;

public class OuterClass {
	
	private String x= "akash";

	public void addfun(){
		System.out.println();
		final String y = "i dont konw";
		
		class InnerClass{
			void addnew(){
				System.out.println("value of x" +x);
				
				System.out.println("value of y" + y);
			}
		}
		
	}
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		o.addfun();
	}
	
}
