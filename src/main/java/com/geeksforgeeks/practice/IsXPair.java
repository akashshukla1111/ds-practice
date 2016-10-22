package com.geeksforgeeks.practice;

import java.util.HashMap;
import java.util.Map;

public class IsXPair {
	public static void main(String[] args) {

		int[] a = {2, 4, 10, 67, 23, 12};
		int x = 6;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(x - a[0], 1);
		for (int i = 1; i < a.length; i++) {
			if (map.get(a[i]) != 1) {
				map.put((x - a[i]), 1);

			} else {
				System.out.println("present");
				break;
			}
		}
	}

}
