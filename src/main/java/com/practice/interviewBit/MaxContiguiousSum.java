package com.practice.interviewBit;

import java.util.List;

/**
 * Created by ankit on 26/1/16.
 */
public class MaxContiguiousSum {

    public int maxSubArray(final List<Integer> a) {
        int sum=a.get(0);
        int max =a.get(0);
        for(int i=1;i<a.size();i++){
            sum= Math.max(sum+a.get(i),a.get(i));
            max=Math.max(sum,max);
        }
    return max;
    }
}

