package com.practice.hackerRank;
	
    /*
        Created By : akasshukla
              Date : 1/14/18   9:32 PM
    */

import java.util.Scanner;

public class ReverseArray {

		public void reverse(int[] nus){
			int size = nus.length;
			for (int i=0;i<size/2;i++){
				nus[i]=nus[i]+nus[size-1-i];
				nus[size-1-i]=nus[i]-nus[size-1-i];
				nus[i]=nus[i]-nus[size-1-i];
			}
			for (int i=0;i<size;i++){
				System.out.print(nus[i]+" ");
			}
		}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		ReverseArray reverseArray=new ReverseArray();
		reverseArray.reverse(arr);

	}

}
    
    