package com.hackerearth.paper;

import java.util.Scanner;

public class Pencil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[];
		for (int i = 0; i < T; i++) {
			int L = sc.nextInt();
			arr = new int[L];
			for (int j = 0; j < L; j++) {
				arr[j] = sc.nextInt();
			}
			countPencils(arr);
		}
	}
	public static void countPencils(int[] arr) {
		int len = arr.length;
		int s = 0;
		int e = len - 1;
		int mSum = arr[s];
		int rSum = arr[e];
		if (len >= 2) {
			while (s < e && (s + 1) != e) {
				if (mSum < 2 * rSum) {
					++s;
					mSum = mSum + arr[s];
				} else if (mSum > 2 * rSum) {
					--e;
					rSum = rSum + arr[e];
				} else {
					++s;
					--e;
					mSum = mSum + arr[s];
					rSum = rSum + arr[e];
				}
			}
			System.out.println((s + 1) + " " + (len - e));
		}
	}
}
