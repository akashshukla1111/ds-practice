package com.hackerearth.practice;

import java.util.Scanner;

class RoyAndProfilePic {

	private static int size;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String result = checkPic(Integer.parseInt(sc.next()),
					Integer.parseInt(sc.next()));
			System.out.println(result);
		}
	}
	public static String checkPic(int w, int h) {
		if (w < size || h < size) {
			return "UPLOAD ANOTHER";
		} else if (w == h) {
			return "ACCEPTED";
		} else {
			return "CROP IT";
		}
	}
}
