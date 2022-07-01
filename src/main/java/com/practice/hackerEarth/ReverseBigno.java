package com.hackerearth.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseBigno {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in), 16384);
		String Tt = bf.readLine();

		for (int i = 0; i < Integer.parseInt(Tt); i++) {
			String s = bf.readLine();
			System.out.println(checkReverse(s.charAt(0)));
		}
	}
	public static String checkReverse(char bg) {

		return Character.getNumericValue(bg) % 2 == 0 ? "EVEN" : "ODD";

	}
}
