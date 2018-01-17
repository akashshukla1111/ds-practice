package com.hackerrank.practice;

// Java program to print all permutations of a
// given string.
public class Permutation {
	public static void main(String[] args) {
		String str = "ABB";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str.toCharArray(), 0, n - 1);
	}

	private void permute(char[] str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				boolean isAnyEqual = isAnyEqual(str, l, i);
				if (!isAnyEqual) {
					str = swap(str, l, i);
					permute(str, l + 1, r);
				}
			}
		}
	}

	public boolean isAnyEqual(char[] charArray, int start, int curr) {
		for (int i = start; i < curr; i++) {
			if (charArray[i] == charArray[curr]) {
				return true;
			}
		}
		return false;
	}

	public char[] swap(char[] charArray, int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return charArray;
	}

}