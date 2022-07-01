package com.interviewbit.practice;

import java.util.ArrayList;

/**
 * Created by akashshukla on 17/01/16.
 */
public class PrimeSum {
    public static void main(String[] args) {
        System.out.println( primeSum(48));
    }
    public static ArrayList<Integer> primeSum(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =2 ; i<= n/2; i++){
            if(isPrime(n-i) && isPrime(i)){
                    list.add(i);
                    list.add(n-i);
                break;
            }
           }
        return list;
    }
    public static boolean isPrime(int n){
        for(int i =2 ; i <= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
