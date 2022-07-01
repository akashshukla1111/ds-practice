package com.interviewbit.practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by akashshukla on 21/01/16.
 */
public class MaxSet {

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        double sum = 0;
        double max =0;
        int i=0;
        int start=0;
        int count=0;
        int endindex =0;
        while(i <= a.size()){
            if(i < a.size() && a.get(i) >= 0){
                sum = sum+(double)a.get(i);
                count++;
            }else{
                if(max < sum || (max == sum && endindex-start < count)) {
                    max = sum;
                    endindex = i;
                    start = endindex - count;
                }
                sum=0;
                count = 0;
            }
            i++;
        }
        return new ArrayList<>(a.subList(start, endindex));
    }

}
