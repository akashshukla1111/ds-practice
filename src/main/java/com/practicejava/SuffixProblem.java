package com.practicejava;

import java.util.Scanner;

class SuffixProblem {
	public static void main(String[] args) throws java.lang.Exception {
//		String s = "World";
//		String s2 = "Hello World";

		Scanner scanner = new Scanner(System.in);
		String fullString = scanner.nextLine();
		System.out.println(getSuffix(fullString));

	}

	public static String getSuffix(String fullString){
		String[] split = fullString.split(",");
		if (split.length!=2){
			return null;
		}
		String s = split[0].trim();
		String s2 =split[1].trim();
		String small, large;
		if (s.length() > s2.length()) {
			small = s2;
			large = s;
		}
		else {
			small = s;
			large = s2;
		}
		int index=small.length();
		int ll=large.length();
		int count=0;
		char[] larr=large.toCharArray();
		for (int j=ll-1; j>=0 ;j--){
			if (index==0)
				break;
			if (larr[j]!=small.charAt(index-1))
				break;
			index--;
			count++;
		}
		if (index == small.length())
			return null;
		else
			return large.substring(ll-count, large.length());
	}
}