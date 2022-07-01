package com.paper.hackerearth;
	
    /*
		Created By : akasshukla
              Date : 11/14/17   11:27 PM
    */

public class FindSmallestNumber {

	public int findSmallest(int n) {

		int i, j = 0;
		int MAX = 50;
		// To sore digits of result in reverse order
		int[] res = new int[MAX];

		// Case 1: If number is smaller than 10
		if (n < 0)
			return -1;
		if (n < 10) {
			return n + 10;
		}

		// Case 2: Start with 9 and try every possible digit
		for (i = 9; i > 1; i--) {
			// If current digit divides n, then store all
			// occurrences of current digit in res
			while (n % i == 0) {
				n = n / i;
				res[j] = i;
				j++;
			}
		}
		// If n could not be broken in form of digits (prime factors of n
		// are greater than 9)

		if (n > 10) {
			return -1;
		}
		// calculate the result
		int rs = 0;
		for (i = j - 1; i >= 0; i--) {
			rs = rs * 10 + res[i];
		}
		return rs;
	}

}