package com.practice.interviewBit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akash on 22/02/16.
 */
public class SetZero {

    public List<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> a) {
        int row = a.size();
        int col =a.get(0).size();
        int rowflag=1;
        int colflag=1;
        for(int i=0; i< row;i++){
            if(a.get(i).get(0)==0){
                colflag = 0;
                break;
            }
        }
        for(int i=0;i< col;i++){
            if(a.get(0).get(i)==0)
                rowflag=0;
                break;
        }
        for(int r=1;r<row;r++){
            for(int c=1;c<col;c++){
                if(a.get(r).get(c)==0){
                  a.get(0).set(c,0);
                  a.get(r).set(0,0);
                }
            }

        }
        for (int r=1 ;r<row;r++){
            for(int c=1;c<col;c++){
                if(a.get(0).get(c)==0 || a.get(r).get(0) ==0){
                    a.get(r).set(c,0);
                }
            }
        }
        if(colflag == 0){
            for(int i=0;i< row;i++){
               a.get(i).set(0,0);
            }
        }
        if(rowflag ==0){
            for(int i=0;i<col;i++){
                a.get(0).set(i,0);
            }
        }
        return a;
    }
}
