package com.interviewbit.practice;

/**
 * Created by akashshukla on 17/01/16.
 */
public class Excel {

    public int titleToNumber(String a) {
        char[] ch = a.toCharArray();
        int sum = 0;
        for(int i =0 ; i < ch.length ; i++){
            sum= sum+(int)Math.pow(26,i)*((int)ch[ch.length-1-i]-64);
        }
        return sum;
    }
}
