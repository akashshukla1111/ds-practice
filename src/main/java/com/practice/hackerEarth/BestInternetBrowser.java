package com.practice.hackerEarth;

import java.util.Scanner;

class BestInternetBrowser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < i; j++) {
			String str = sc.nextLine();
			int val = getVowel(str);
			System.out.println(str.length() - val - 4 + "/" + str.length());
		}
	}
	public static int getVowel(String s) {

		int i = 4;
		int sum = 0;
		while (s.charAt(i) != '.') {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sum = sum + 1;
			}
			i++;
		}

		return sum;
	}
}
