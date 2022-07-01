package com.paper.hackerearth;

import java.util.Scanner;

public class ChepPal {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int i = s.nextInt();
		while (i-- > 0) {

			System.out.println(checkPal(s1.nextLine().toCharArray(),
					s.nextInt(), s.nextInt()));
		}
	}

	public static int checkPal(char[] arr, int acost, int bcost) {
		int frw = arr.length / 2;
		int prev = frw - 1;
		char cost = (acost < bcost) ? 'a' : 'b';
		int vcost = (acost < bcost) ? acost : bcost;
		int sum = 0;
		while (prev >= 0) {
			System.out.println(prev);
			if (arr[prev] != '/' && arr[frw] != '/') {
				if (arr[prev] != arr[frw]) {
					break;
				}
			} else {
				if (arr[prev] == '/' && arr[frw] == '/') {
					arr[prev] = arr[frw] = cost;
					sum = sum + 2 * vcost;
				} else if (arr[prev] == '/') {
					arr[prev] = arr[frw];
					sum = sum + (arr[prev] == 'a' ? acost : bcost);
				} else {
					arr[frw] = arr[prev];
					sum = sum + (arr[prev] == 'a' ? acost : bcost);
				}
			}
			--prev;
			++frw;
		}
		System.out.println(arr);
		return sum;
	}

}
