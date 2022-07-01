package com.practice.interviewBit;

/**
 * Created by akashshukla on 17/01/16.
 */
public class BinaryBit {
    public static String findDigitsInBinary(int a) {
        if(a<=0){
            return "0";
        }
        String b = new String();
        while (a>0){
            if(a%2==0){
                b = 0+b;
            }else
            {
               b=1+b;
            }
            a = a/2;
        }
    return b;
    }
}
