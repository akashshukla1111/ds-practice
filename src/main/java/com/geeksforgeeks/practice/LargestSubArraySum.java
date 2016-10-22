package com.geeksforgeeks.practice;

public class LargestSubArraySum {

	public static void main(String[] args) {

		int a[] = {-2, -3, 4, -1, 2, 1, -5, 3};
		int update = 0;
		int max = 0;
		int i = 0;
		while (i <= (a.length - 1)) {
			while (a[i] > 0) {
				max = max + a[i];
				if (i == a.length - 1) {
					break;
				}
				i++;
			}
			if (max > update) {
				update = max;
			}
			max = 0;
			i++;
		}
		System.out.println("max sub array  :  " + update);
	}
}
