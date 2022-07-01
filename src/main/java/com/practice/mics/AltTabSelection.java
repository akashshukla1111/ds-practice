package com.practice.mics;

public class AltTabSelection {


    public int[] altTab(int a, int b , int[] arr) {
        int[] temp = new int[arr.length];
        boolean flag =true;
        for(int i=0; i<a; i ++)
        {
            if (i!=b && flag){
                temp[i+1]=arr[i];
            }else{
                temp[i]=arr[i];
                flag =false;
            }
        }
        temp[0]=arr[b-1];
        return temp;
    }


}