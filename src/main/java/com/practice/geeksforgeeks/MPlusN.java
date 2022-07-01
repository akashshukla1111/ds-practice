package com.practice.geeksforgeeks;

public class MPlusN {

	public static void main(String[] args) {

		Integer mPlusN[] = {2, 8, null, null, null, 13, null, 15, 20};
		Integer N[] = {5, 7, 9, 25};
		Integer[] arrangearr = Arrange(mPlusN);
		for (Integer i : arrangearr) {
			System.out.println(i);
		}

	}
	public static Integer[] Arrange(Integer[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] != null) {
				if (arr[end] != null) {
					--end;
				} else {
					arr[end] = arr[start];
					--end;
					++start;
				}
			} else {
				++start;
			}

		}
		return arr;
	}
}
