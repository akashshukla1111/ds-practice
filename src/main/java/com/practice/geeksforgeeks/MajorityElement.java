package com.practice.geeksforgeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {

		String nos="3 3 3 4 2 4 4 2 4";
		String[] split = nos.split(" ");
        int[] arr = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
		int keytemp = 3;
		int i = 1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(arr[0], 1);
		while (i < arr.length) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
				if (map.get(arr[i]) >= map.get(keytemp)) {
					keytemp = arr[i];

				}
			}
			i++;
		}
		System.out.println("key   : " + keytemp + " :" + map.get(keytemp));
	}
}
