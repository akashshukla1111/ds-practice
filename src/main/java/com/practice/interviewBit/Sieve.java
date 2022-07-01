package com.interviewbit.practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by akashshukla on 17/01/16.
 */
public class Sieve {


    public static ArrayList<Integer> sieve(int a){
        ArrayList<Integer> list = new ArrayList<>();
         for(int i = 2 ;i<=a/2; i++){
             if(isPrime(i)){
                 list.add(i);
             }
             if(isPrime(a-i) && i!=(a-i)){
                list.add(a-i);
             }
         }
        Collections.sort(list);
        return list;
    }

    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i =2 ; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
