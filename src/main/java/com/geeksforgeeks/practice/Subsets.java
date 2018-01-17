package com.geeksforgeeks.practice;
	
    /*
        Created By : akasshukla
              Date : 12/11/17   8:03 PM
    */

import java.util.HashMap;
import java.util.List;

public class Subsets {

	public void printSubsets(char[] chars){
		int l=chars.length;

		for (int i=0; i<(1<<l);i++){
			System.out.print("{");
				for (int j=0;j<l;j++){
					if ((i & (1<<j)) > 0){
						System.out.print(chars[j]+"");
					}
				}
			System.out.println("}");
		}

	}

//	public static void main(String[] args) {
//		Subsets s =new Subsets();
//		char[] chars={'a','b','c'};
//		System.out.println(1<<2);
//		s.printSubsets(chars);
//
//	}

	public static void main(String a[]) {
		HashMap hashMap = new HashMap();
		HashMap hashMap1 = new HashMap();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		System.out.println("Original HashMap : " + hashMap.hashCode());
		hashMap1 = (HashMap) hashMap.clone();
		System.out.println("Copied HashMap : " + hashMap1.hashCode());
	}

	public void allSubsets(int[] givenArr, int psize, List<Integer[]> output){

	}




}

