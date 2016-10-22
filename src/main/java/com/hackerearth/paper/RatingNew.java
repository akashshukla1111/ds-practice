package com.hackerearth.paper;

import java.util.Scanner;

class RatingNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		int sum = 0;
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		int j = arr.length - 1;
		while (j >= 0) {
			if (arr[j] > 0 && arr[j] <= 10) {
				sum = sum + arr[j];
				j--;
			} else if (arr[j] == 0) {
				j = j - 2;
			}
		}

		System.out.println(sum);
	}

}
