package com.practice.hackerEarth;

import java.util.Scanner;

public class CompleteString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int val = Integer.parseInt(input);
		int[] arr = new int[26];
		while (val >= 0) {
			String st = sc.nextLine();
			System.out.println(compString(st));

		}

	}
	public static String compString(String st) {
		if (st.length() >= 26) {
			int arr[] = new int[26];
			int i = st.length() - 1;
			while (i >= 0 && st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				arr[st.charAt(i) - 97] = 1;
				i--;
			}
			int sum = 0;
			for (int j = 0; j < 26; j++) {
				sum = sum + arr[j];
			}
			if (sum == 26) {
				return "YES";
			} else {
				return "NO";
			}
		} else {
			return "NO";
		}
	}

}
