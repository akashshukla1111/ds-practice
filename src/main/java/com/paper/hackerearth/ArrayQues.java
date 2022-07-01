package com.hackerearth.paper;

public class ArrayQues {

	public static void main(String[] args) {
		int arr[] = {9, 5};
		char narr[] = new char[arr.length];
		int count = 0;
		int count1 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				count++;
				System.out.println(count);
			} else {
				count1++;
			}
		}
		System.out.println(count1);
		if (Math.abs(count - count1) + 1 == arr.length) {

			if (count > count1) {
				System.out.println("sorted accending order");
			} else {
				System.out.println("decending order");
			}
		} else {
			System.out.println("not sorted array");
		}
	}

}
