package com.practice.geeksforgeeks.hashing;

import org.junit.jupiter.api.Test;

public class DivisiblepairTest {

	@Test
	public void divisiblePair() throws Exception {
		int[] arr= {9, 7, 5, 3};
		int k=6;
		Divisiblepair divisiblepair=new Divisiblepair();
		System.out.println(divisiblepair.divisiblePair(arr,k));
	}
}