package com.practice.mics;

import java.util.HashMap;

class LargestSubArray1
{
 
    // Returns largest subarray with equal number of 0s and 1s
	int maxLen(int arr[], int n)
    {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
 
        int sum = 0;     // Initialize sum of elements
        int max_len = 0; // Initialize result
        int ending_index = -1;
        int start_index = 0;
 
        for (int i = 0; i < n; i++) 
        {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }
 
        // Traverse through the given array
        for (int i = 0; i < n; i++) 
        {
            // Add current element to sum
            sum += arr[i];
 
            // To handle sum=0 at last index
            if (sum == 0) 
            {
                max_len = i + 1;
                ending_index = i;
            }
 
            // If this sum is seen before, then update max_len
            // if required
            if (hM.containsKey(sum+n))
            {
                if (max_len < i - hM.get(sum + n)) 
                {
                    max_len = i - hM.get(sum + n);
                    ending_index = i;
                }
            } 
            else // Else put this sum in hash table
                hM.put(sum + n, i);
        }
 
        for (int i = 0; i < n; i++) 
        {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }
 
        int end = ending_index - max_len + 1;
        System.out.println(end + " to " + ending_index);
 
        return max_len;
    }
 
    /* Driver program to test the above functions */
    public static void main(String[] args) 
    {
        LargestSubArray1 sub = new LargestSubArray1();
        int arr[] = {1, 1, 0, 1};
        int n = arr.length;

        System.out.println(sub.maxLen(arr, n));
    }
}