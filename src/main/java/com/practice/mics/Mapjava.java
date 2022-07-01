package com.practice.mics;

import java.util.HashMap;
import java.util.Scanner;

public class Mapjava {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("pls enter name");
		char fin = check(s.next());
		System.out.println(fin);
	}

	public static char check(String name) {

		int length = name.length();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < length; i++) {
			char c;
			if (map.containsKey(c = name.charAt(i))) {
				map.put(c, map.get(c) + 1);
				return c;

			} else {
				map.put(c, 1);

			}
		}
		return 0;

	}

}
