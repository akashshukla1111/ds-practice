package com.collection.practicejava;

import java.util.HashMap;
import java.util.HashSet;

class AnnonClass {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		String[] al1 = { "A", "A", "B", "L", "C", "F", "D", "E", "F", "D", "Z",
				"R" };
		String[] al2 = { "C", "E", "X", "Z", "M", "X", "P", "L", "M", "N", "S",
				"T", "P", "B", "A" };

		for (int i = 0; i < al2.length ; i++) {
			hm.put(al2[i], al2[i]);
		}
		HashSet<String> fi = new HashSet<>();
		for (int j = 0; j < al1.length - 1; j++) {

			if (hm.get(al1[j]) != null) {
				fi.add(hm.get(al1[j]));
			}
		}
		System.out.println(fi);
	}
}