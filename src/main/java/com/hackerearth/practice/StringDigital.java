package com.hackerearth.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringDigital {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String digit = bf.readLine();
		int sum = 0;
		for (char s : digit.toCharArray()) {
			switch (s) {
				case '0' :
				case '6' :
				case '9' :
					sum += 6;
					break;
				case '2' :
				case '3' :
				case '5' :
					sum += 5;
					break;
				case '4' :
					sum += 4;
					break;
				case '7' :
					sum += 3;
					break;
				case '1' :
					sum += 2;
					break;
				case '8' :
					sum += 7;
					break;

			}
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis() - start);
	}
}