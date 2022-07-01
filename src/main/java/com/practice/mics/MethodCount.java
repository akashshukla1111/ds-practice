package com.practice.mics;

import java.lang.reflect.Method;

public class MethodCount {

	public static void methodPrintAndCount() throws ClassNotFoundException {
		Class<?> aClass = Class.forName("java.lang.Object");
		Method[] methods = aClass.getDeclaredMethods();
		for (Method m:methods){
			System.out.println(m);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
//		methodPrintAndCount();

		String s = Integer.toHexString(12);
		String name = new String("akash");
		name =name.concat("shukla");
		System.out.println(name);
		StringBuffer bf = new StringBuffer("akash");
		bf.append("shukla");
		System.out.println(bf);

	}

}
