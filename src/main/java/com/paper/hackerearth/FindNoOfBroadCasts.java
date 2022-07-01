package com.paper.hackerearth;
	
    /*
        Created By : akasshukla
              Date : 11/14/17   11:48 PM
    */

import java.util.Random;

public class FindNoOfBroadCasts {

	public Integer getNoOflikes(Integer[] arr, int si,int li, int likes){
		int broadcosts=0;
		for (int ix=si;ix<=li;ix++){
			if (likes == arr[ix]){
				broadcosts++;
			}
		}
		return broadcosts;
	}

	public static void main(String[] args) {
		Random dice = new Random();

		int n = dice.nextInt(6);
		System.out.println(n+1);
	}


}