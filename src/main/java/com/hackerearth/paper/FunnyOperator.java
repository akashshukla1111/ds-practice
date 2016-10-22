package com.hackerearth.paper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by akash on 21/02/16.
 */
public class FunnyOperator {

    public static String token = " ";
    private int max=0;

    public static void main(String[] args) {


        Scanner testcase = new Scanner(System.in);
        List<List<Integer>> t = new ArrayList<>();
        int no = testcase.nextInt();
        for(int i =0 ; i< no;i++){
            List<Integer> temp = new ArrayList<>();
            int arrayno = testcase.nextInt();
             for(int j =0 ; j < arrayno ; j++){
                temp.add(testcase.nextInt());
             }
            t.add(temp);
        }
        t.forEach(tt -> {
            FunnyOperator test = new FunnyOperator();
            test.funnyOperator(tt,"",0);

        });

    }

    public void funnyOperator(List<Integer> list ,String s, int index){

        if(index > (list.size()-1)){
            int temp=0;
            if(!s.isEmpty()){
                temp = getFunnySum(s.trim());
            }
            if( temp > max){
                max =temp;
                System.out.println(s.trim());
            }
            return;
        }
        funnyOperator(list, s+list.get(index)+token,index+1);
        funnyOperator(list, s , index+1);
    }

    public int getFunnySum(String s){
        String  t = new String(s);
        String[] tk = t.split(" ");
        int xor = Integer.parseInt(tk[0]);
        int and =Integer.parseInt(tk[0]);
        for(int i=1 ; i< tk.length ; i++){
            xor =  ( xor ^ Integer.parseInt(tk[i]) );
            and = (and & Integer.parseInt(tk[i]));
        }
        return xor | and;

    }
}
