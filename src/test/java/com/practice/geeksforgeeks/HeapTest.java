package com.practice.geeksforgeeks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

public class HeapTest {

	Heap h;

	@BeforeEach
	public void setup(){
		h = new Heap(5);
		h.inseart(7);
		h.inseart(10);
		h.inseart(20);
		h.inseart(4);
		h.inseart(12);

	}

	@Test
	public void inseart()  {
		showArray(h.getArr());
	}

	@Test
	public void getDecreaseKey() throws Exception {
			h.getDecreaseKey(4, 1);
			showArray(h.getArr());
	}

	public void showArray(int[] arr){
		System.out.println(Arrays.toString(arr));
	}

}