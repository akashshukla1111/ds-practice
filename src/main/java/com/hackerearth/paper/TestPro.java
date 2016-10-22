package com.hackerearth.paper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TestPro {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Integer len = arr.length;
		BigInteger biglen = new BigInteger(len.toString());
		StringBuilder sb = new StringBuilder();

		Integer T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			BigInteger a = new BigInteger(br.readLine());
			BigInteger b = new BigInteger(br.readLine());
			if (arr[a.remainder(biglen).intValue() - 1] == arr[b.remainder(
					biglen).intValue() - 1]) {
				sb.append("YES\n");
			} else {
				sb.append("NO");
			}
		}
		System.out.println(sb);
	}
}
