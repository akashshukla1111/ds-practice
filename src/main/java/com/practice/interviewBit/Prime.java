package com.practice.interviewBit;

/**
 * Created by akashshukla on 17/01/16.
 */
public class Prime {

    public static boolean isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (A % i == 0) return false;
        }
        if(A<=1){
            return false;
        }
        return true;
    }
}
