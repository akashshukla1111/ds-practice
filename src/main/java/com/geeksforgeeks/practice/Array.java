package com.geeksforgeeks.practice;

import java.util.Arrays;

public class Array {
	//rotate an array with d elements

	public Integer[] rotate(Integer arr[] , int d){
		int length = arr.length;
		int gcd = getGCD(length, d);
		int temp=0;
		for (int i=0 ; i<d;i++) {
			if (temp-gcd>=0){
				temp=0;
			}
			int t = arr[temp];
			int prevj=0;
			for (int j = temp; j < length;j=j + gcd) {
				if (j+gcd<length)
				arr[j] = arr[j + gcd];
				prevj=j;
			}
			arr[prevj]=t;
			temp++;
		}
		return arr;
	}

	public int getGCD(int f , int s){
		if (f<s){
			int temp=f;
			f=s;
			s=temp;
		}
		if (f%s==0){
			return s;
		}
	  return getGCD(s,f%s);
	}

	public Integer[] rotateReverseAlgo(Integer[] arr, int d){

		reverseArray(arr, 0, d);

		reverseArray(arr, d , arr.length);
		System.out.println(Arrays.toString(arr));
		reverseArray(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));

		return arr;

	}
	public Integer[] reverseArray(Integer[] arr,int start, int end){
		int len = end + start;
		for (int i=start;i<len/2;i++){
			int temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
		}
		return arr;
	}
//   0 1 2 3 4 5 6 7 8 9 10 11 12 13

	public Integer[] blackSwapRotate(Integer[] arr, int si, int li, int d){

		int sizeA=d-si;
		int sizeB=li-d+1;
		if (sizeA==sizeB){
			for (int i=0;i<sizeA;i++){
				swap(arr,si+i,si+sizeA+i);
			}
		}
		if (sizeA>sizeB){
			// swap sizeB to size A
			for (int i=0;i<sizeB;i++){
				swap(arr,si+i,si+sizeA+i);
			}
			// increase the first index, as we are getting swap that many element
			blackSwapRotate(arr,si+sizeB,li,d);
		}
		if (sizeA<sizeB){
			for (int i=0;i<sizeA;i++){
				swap(arr,si+i,li-sizeA+1+i);
			}
			// reduce last index how many element you swap : sizeA
			blackSwapRotate(arr,si,li-sizeA,d);
		}
		return arr;
	}
	private void swap(Integer[] arr, int fi, int swapi){
		int temp=arr[fi];
		arr[fi]=arr[swapi];
		arr[swapi]=temp;
	}
}
