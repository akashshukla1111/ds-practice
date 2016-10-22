package com.hackerearth.practice;

import java.util.Scanner;

class CheckOddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int val = Integer.parseInt(s);
		String[] str = new String[val];
		for (int i = 0; i < val; i++) {
			str[i] = sc.nextLine();
			System.out
					.println(Character.getNumericValue(str[i].charAt(0)) % 2 == 0
							? "EVEN"
							: "ODD");
		}

	}

}
