package com.interviewbit.practice;

import java.util.*;

/**
 * Created by akash on 27/1/16.
 */
public class LargestNum {

    public static String largestNumber(final List<Integer> a) {
        Collections.sort(a, (o1, o2) ->
        Integer.parseInt(o2.toString()+o1.toString()) > Integer.parseInt(o1.toString()+o2.toString())? 1:-1);
        String s =a.get(0).toString();
        int i=1;
        int sum=a.get(0);
        while (i<a.size()&&sum>0){
            s=s+a.get(i);
            sum=sum+a.get(i++);
        }
        return sum>0?s:"0";
    }
}
