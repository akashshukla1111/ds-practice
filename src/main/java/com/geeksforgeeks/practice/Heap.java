package com.geeksforgeeks.practice;

import java.util.Arrays;

public class Heap {

	int capacity;
	int index;
	int[] arr;

	public int[] getArr() {
		return arr;
	}

	public Heap() {
		this(10);
	}

	public Heap(int size) {
		this.index = 0;
		this.capacity = size;
		this.arr = new int[capacity];
	}

	public int getParent(int i) {
		return (i - 1) / 2;
	}

	public int getLeft(int i) {
		return (2 * i + 1);
	}

	public int getRight(int i) {
		return (2 * i + 2);
	}

	public int getMin() {
		return arr[0];
	}

	public void inseart(int val) {
		if (!(capacity > index))
			System.out.println("overloaded");
		else {
			int i = index;
			if (i != 0 && arr[i] < arr[getParent(i)]) {
				downToTopHeapify(val, i);
			}
			else {
				arr[i] = val;
			}
			index++;
		}
	}

	public void getDecreaseKey(int i, int val) {
		if (capacity <= i)
			System.out.println("Given index is not the heap Range");
		int ix = i - 1;
		arr[ix] = val;
		downToTopHeapify(val, ix);
	}

	private void downToTopHeapify(int val, int ix) {
		arr[ix] = val;
		while (ix != 0 && arr[ix] < arr[getParent(ix)]) {
			swap(ix);
			arr[getParent(ix)] = val;
			ix = getParent(ix);
		}
	}

	public void minHeapify(int i) {

		if (i>=arr.length){
			return;
		}
		int l = getLeft(i);
		int r = getRight(i);
		int root = arr[i];
		int sm=i;
		if (l < index && root>arr[l]) {
			sm=l;
		}
		if (r < index && root>arr[r]){
			sm=r;
		}
		if (sm!=i){
			int temp=arr[i];
			arr[i]=arr[sm];
			arr[sm]=temp;
			minHeapify(sm);
		}

	}

	private void swap(int i) {
		arr[i] = arr[getParent(i)];

	}
}
