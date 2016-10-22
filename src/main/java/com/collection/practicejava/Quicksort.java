package com.collection.practicejava;

public class Quicksort {

	public static void main(String[] args) {
		int[] a = {2, 5, 8, 1, 7, 6};
		Quicksort qs = new Quicksort();
		qs.partition(a, 0, 5);
		// System.out.println(value);
		for (int d : a) {
			System.out.print(d + " ");
		}

	}

	public void quickSort(int[] a, int st, int end) {
		int pindex;
		if (st < end) {
			pindex = partition(a, st, end);
			quickSort(a, st, pindex - 1);
			quickSort(a, pindex + 1, end);

		}
	}

	public int partition(int[] a, int st, int end) {

		int pivot = a[end];
		int pointer = st;
		for (int i = 0; i < end; i++) {

			if (a[i] <= pivot) {
				swap(a, pointer, i);
				pointer = pointer + 1;
			}
		}

		swap(a, pointer, end);
		return pointer;

	}

	public void swap(int[] a, int pointer, int i) {

	}

}
