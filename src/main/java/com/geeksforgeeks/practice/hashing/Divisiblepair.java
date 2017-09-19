package com.geeksforgeeks.practice.hashing;

import java.util.HashMap;
import java.util.Map;

public class Divisiblepair {

	// http://www.geeksforgeeks.org/check-if-an-array-can-be-divided-into-pairs-whose-sum-is-divisible-by-k/

	public  boolean divisiblePair(int[] arr,int k){

		Map<Integer,Integer> val = new HashMap<>();

		for (int a :arr){
			int rem = a % k;
			if (val.get(rem)==null)
				val.put(rem,0);
			val.put(rem,val.get(rem)+1);
		}

		for (Map.Entry<Integer,Integer> entry:val.entrySet()){
			Integer key = entry.getKey();
			if (key*2==k || key == 0){
				if(val.get(key)%2==1) return false;
			}else if (val.get(key) != val.get(k-key)){
				return false;
			}
		}
		return true;
	}
}
