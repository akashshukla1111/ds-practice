package com.interviewbit.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akashshukla on 18/01/16.
 */
public class Spiral {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>(Arrays.asList(1,2,3)));
        l.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        l.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        System.out.println(l.size()*l.get(0).size());
        int n= l.size()*l.get(0).size();
        int i=0,j=0;
        while (n-->0){
            l.get(i).get(j++);
            l.get(i++).get(j);
            l.get(i).get(j--);
            l.get(i--).get(j);
        }

        StringBuffer a = new StringBuffer();
    }
}
