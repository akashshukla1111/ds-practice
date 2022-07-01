package com.hackerearth.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		BigInteger[] arr = new BigInteger[i];
		for (int j = 1; j <= i; j++) {
			arr[j - 1] = factorial(sc.nextInt());
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

	public static BigInteger factorial(int no) {

		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");

		while (no-- > 0) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);

		}
		return fact;
	}
}
