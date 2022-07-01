package com.practice.hackerEarth;

import java.util.Scanner;

public class PalindromicNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		while (i-- > 0) {
			String str = sc.nextLine();
			String[] ch = str.split(" ");
			int start = Integer.parseInt(ch[0]);
			int end = Integer.parseInt(ch[1]);
			int count = 0;
			for (int j = start; j <= end; j++) {
				if (isPal(j) == true) {
					count += 1;
				}
			}
			System.out.println(count);
		}

	}

	public static boolean isPal(Integer no) {
		int f = 0, l;
		boolean flag = true;
		String str = no.toString();
		l = str.length() - 1;
		while (f < l) {
			if (str.charAt(f) != str.charAt(l)) {
				flag = false;
				break;
			}
			f++;
			l--;
		}
		return flag;
	}

}
