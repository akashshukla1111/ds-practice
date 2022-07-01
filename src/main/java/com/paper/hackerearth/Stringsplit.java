package com.paper.hackerearth;

import java.util.Scanner;

class Stringsplit {
	private static int sum;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String value = s.next();
		for (char ch : value.toCharArray()) {
			getDigit(ch);
		}
		System.out.println(sum);
	}

	public static void getDigit(char ch) {

		if (ch == '1') {
			sum += 2;
		} else if (ch == '8') {
			sum += 7;
		} else if (ch == '0' || ch == '6' || ch == '9') {
			sum += 6;
		} else if (ch == '2' || ch == '3' || ch == '5') {
			sum += 5;
		} else if (ch == '4') {
			sum += 4;
		} else if (ch == '7') {
			sum += 3;
		}

	}
}
