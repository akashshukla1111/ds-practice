package com.practice.geeksforgeeks;

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
		 int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14};
		int[] rotated = a.blackSwapRotate(arr,0,arr.length-1,5);
		int[] actual = {6, 7, 8, 9, 10, 11, 12, 13, 14, 1,2,3,4,5};
		Assert.assertArrayEquals(rotated, actual);
	}

	@Test
	public void rotatedArraySearch() throws Exception {
		Integer[] actual = {3, 4, 5, 7, 8, 1,2};
		boolean ans = a.rotatedArraySearch(actual, 0, actual.length - 1, 8);
		System.out.println(ans);

	}

	@Test
	public void arrangeNumber() throws Exception {
		int[] arr = {4,6,2,-2,-7,-13,16,19,3};
		System.out.println(Arrays.toString(a.arrangeNumber(arr)));
	}

	@Test
	public void arragneMaxAndMin() throws Exception {
		int[] input={1,2,3,4,5,6,7,8,9};
		int[] actual={9, 1 ,8, 3, 7, 5, 6, 4, 2};
		int[] expected = a.rearrangeMaxandMin(input);
		System.out.println(Arrays.toString(expected));
		Assert.assertArrayEquals(expected,actual);

	}

	@Test
	public void segregateZeroOneTest() throws Exception {
		Integer[] arr= {1,1,1,1,0,1,1,1,1,1};
		System.out.println(Arrays.toString(a.segregateZeroOne(arr)));
	}

	@Test
	public void segregateEvenOdd() throws Exception {
		int[] arr={9, 1 ,8, 2, 7, 3, 6, 4, 5};
		int[] expected=a.segregateEvenOdd(arr);
		System.out.println(Arrays.toString(expected));
	}

	@Test
	public void findDuplicate() throws Exception {
		a.setBitCounts(3);
		a.setBitCountsBetter(1);

	}

	@Test
	public void findDuplicates() {
		int[] input={1,2,3,3,4,5,6,2,4,4,6,2};
		a.findDuplicates(input);
	}

	@Test
	public void findSmallestPositiveMissingNum() {
		int[] input= {6,1,3,5};
		int missingNum = a.findSmallestPositiveMissingNum(input);
		System.out.println(missingNum);
	}

	@Test
	public void findMaximumRepeatingElement() {
		int[] input=  {1,4, 4, 4, 0, 2, 0, 2, 3, 4, 0, 9, 2, 3};
		int maximumRepeatingElement = a.findMaximumRepeatingElement(input);
		System.out.println(maximumRepeatingElement);
	}

	@Test
	public void countFrequencies() {
		int arr[] ={2, 3, 3, 2, 5};
		a.countFrequencies(arr);
	}
}
