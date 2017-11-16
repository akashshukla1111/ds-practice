package com.geeksforgeeks.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {
	private Array a;
	private Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14};

	@Before
	public void setup() {
		a = new Array();

	}

	@Test
	public void getGCDTest() throws Exception {
		int gcd = a.getGCD(12, 3);
		Assert.assertEquals(gcd, 3);
	}

	@Test
	public void rotateWithJugglingAlgo() throws Exception {

		Integer[] rotated = a.rotate(arr, 4);
		Integer[] actual = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 2, 3, 4 };
		Assert.assertArrayEquals(rotated, actual);
	}

	@Test
	public void revrseArrayTest() throws Exception {
		Integer[] integers = a.reverseArray(arr,0,arr.length);
		System.out.println(Arrays.toString(integers));
	}

	@Test
	public void rotateArray() throws Exception {
		Integer[] rotated = a.rotateReverseAlgo(arr,4);
		Integer[] actual = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 2, 3, 4 };
		Assert.assertArrayEquals(rotated, actual);
	}

	@Test
	public void blackSwapAlgo() throws Exception {
		Integer[] rotated = a.blackSwapRotate(arr,0,arr.length-1,5);
		Integer[] actual = {6, 7, 8, 9, 10, 11, 12, 13, 14, 1,2,3,4,5};
		Assert.assertArrayEquals(rotated, actual);
	}

	@Test
	public void rotatedArraySearch() throws Exception {
		Integer[] actual = {6, 7, 8, 9, 10, 11, 12, 13, 14, 1,2,3,4,5};
		for (int i=1;i<19;i++){
		boolean ans = a.rotatedArraySearch(actual, 0, arr.length - 1, i);
		System.out.println(ans);
		}
	}

	@Test
	public void arrangeNumber() throws Exception {
		Integer[] arr = {4,6,2,-2,-7,-13,16,19,3};
		System.out.println(Arrays.toString(a.arrangeNumber(arr)));
	}

	@Test
	public void arragneMaxAndMin() throws Exception {
		Integer[] input={1,2,3,4,5,6,7,8,9};
		Integer[] actual={9, 1 ,8, 2, 7, 3, 6, 4, 5};
		Integer[] expected = a.rearrangeMaxandMin(input);
		System.out.println(Arrays.toString(expected));
		Assert.assertArrayEquals(expected,actual);

	}

	@Test
	public void segregateZeroOneTest() throws Exception {
		Integer[] arr= {1,1,1,1,0,1,1,1,1,1};
		System.out.println(Arrays.toString(a.segregateZeroOne(arr)));
	}
}