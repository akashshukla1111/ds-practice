package com.practice.pepcoding.dynamic;

public class StairCaseProblem {


   public int stairCaseRecursive(int n){

       if (n==0){
           return 1;
       }else if(n<0){
           return 0;
       }

       Integer f1 = stairCaseRecursive(n-1);
       Integer f2 = stairCaseRecursive(n - 2);
       Integer f3 = stairCaseRecursive(n - 3);
       Integer totalPath = f1+f2+f3;
       return totalPath;
   }




}
