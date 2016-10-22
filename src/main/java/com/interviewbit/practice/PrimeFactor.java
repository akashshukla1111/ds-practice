package com.interviewbit.practice;

/**
 * Created by akashshukla on 17/01/16.
 */
public class PrimeFactor {

    public static void main(String[] args) {
        primefactor(26);
    }

    public static void primefactor(int n) {
        int i;
        int a =0;
        for( i=2 ; i<=Math.sqrt(n);i++){
           int count=0;
           while (n%i ==0){
               count++;
               n /= i;
           }
            if(count>0) {
                a =a+i;
                System.out.println(i + "    " + count);
            }
       }
        if(i >= Math.sqrt(n) && n>1){
            a=a+n;
            System.out.println(n +"    "+ 1);
        }
        System.out.println("sum  : "+a);
    }
}
