package com.practice.interviewBit;

import java.util.List;

/**
 * Created by akashshukla on 18/01/16.
 */
public class InsertionSort {

    public static List<Integer> insertionSort(List<Integer> list) {
        for(int i=1 ; i<list.size() ; i++){
            int j=i;
            while( j!=0){
                if(!(list.get(j)>list.get(j-1))) {
                    int temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
                j--;
            }
        }
        return list;
    }
}
