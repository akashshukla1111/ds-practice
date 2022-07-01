package com.hackerearth.paper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class SumCountPair
{
    static int arr[] = new int[]{6,6,3,9,3,5,1} ;
     
    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int[] arr, int sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        // Store counts of all elements in map hm
        for (int i=0; i<n; i++){

            // initializing value to 0, if key not found
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);

            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int count = 0;
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            int key = next.getKey();
            if (hm.get(sum-key) !=null && hm.get(key) >0 && hm.get(sum-key) > 0){
                count++;
                hm.put(key,hm.get(key)-1);
                hm.put(sum-key, hm.get(sum-key)-1);
            }
        }
        return count;
    }
 
    // Driver method to test the above function
    public static void main(String[] args) {
        int sum = 6;
        System.out.println("Count of pairs is " + 
                            getPairsCount(arr,12));
         
    }
}