package com.practice.interviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FindAllFactors {
	public static List<Integer> findAllFactors(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =1;i <= Math.sqrt(n); i++){
		if(n%i == 0){
			list.add(i);
			if(i != Math.sqrt(n)){
				list.add(n/i);
			}
		}}
		Collections.sort(list);
	return list;
	}
}
