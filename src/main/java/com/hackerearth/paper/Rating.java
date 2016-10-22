package com.hackerearth.paper;

import java.util.Scanner;

class Rating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		int sum = 0;
		for (int i = 0; i < T; i++) {

			arr[i] = sc.nextInt();

			if (arr[i] > 0) {
				sum = sum + arr[i];
			} else if (i > 0 || arr[i] == 0) {
				sum = sum - arr[i - 1];
			}

		}
		if (sum < 0) {
			sum = 0;
		}
		System.out.println(sum);
	}

}
