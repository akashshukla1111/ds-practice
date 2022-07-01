package com.geeksforgeeks.practice;
	
    /*
        Created By : akasshukla
              Date : 12/11/17   8:03 PM
    */

import java.util.Arrays;

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



	public void allSubsets(char[] givenArr,int level,int i){

		if (level>givenArr.length || i>=givenArr.length) return;

		if (level==givenArr.length){
			System.out.print(givenArr[i] + " " );
		}

		allSubsets(givenArr,level+1,i);
		allSubsets(givenArr,level+1,i+1);

	}


	public void permutation(String s , int level){

		if (level == s.length()){
			System.out.println(s);
		}
		for (int i=level;i<s.length();i++){
			char[] charArray =s.toCharArray();
			swap(charArray, level, i);
			permutation(String.valueOf(charArray),level+1);

		}
	}

	private void swap(char[] charArray, int level, int i) {
		char temp = charArray[level];
		charArray[level]=charArray[i];
		charArray[i]=temp;
	}

	public void subsetsAll(char[] arr,int level , int index,String o,int fi){

		System.out.println(o);
		for (int i=index;i<arr.length-level;i++){
			subsetsAll(arr,level+1,i,""+arr[i],index);
		}
	}

	// print all subset of given length

	public  void subsetsWithGivenLength(int[] nums , int level , int s, int[] out,int subsetL){

		if (level == subsetL){
			System.out.println(Arrays.toString(out));
			return;
		}

		for (int i = s; i < nums.length ; i++){


			// two lines only for removes duplicate
//			int j=i+1;
//			if (j<nums.length && nums[i]==nums[j]) {
//				continue;
//			}

			out[level]=nums[i];
			subsetsWithGivenLength(nums,level+1,i+1,out,subsetL);
		}
	}


	public  void subsetsWithGivenLengthWithoutForLoop(int[] nums , int level , int s , int[] out, int subsetL){

		if (level==subsetL){
			System.out.println(Arrays.toString(out));
			return;
		}

		//termination condition for termination of same level
		if (s >= nums.length)
			return;

		out[level] = nums[s];
		subsetsWithGivenLengthWithoutForLoop(nums,level+1,s+1,out ,subsetL);
		subsetsWithGivenLengthWithoutForLoop(nums,level,s+1,out ,subsetL);
	}



	public static void main(String[] args) {
		Subsets s =new Subsets();
		char[] chars={'a','b','c'};
		int[] arr={1,2,3};
		//s.printSubsets(chars);

		//s.allSubsets(chars,0,0);
		//s.permutation("abb",0);
		int length=3;
		System.out.println("  subsetsWithGivenLength : ");
		s.subsetsWithGivenLength(arr,0,0,new int[length],length);
		System.out.println("  subsetsWithGivenLengthWithoutForLoop : ");
		s.subsetsWithGivenLengthWithoutForLoop(arr,0,0,new int[length],length);
	}
}



