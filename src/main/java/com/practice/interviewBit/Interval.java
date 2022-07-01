package com.interviewbit.practice;

/**
 * Created by akash on 25/1/16.
 */
public class Interval {
         int start;
         int end;
         Interval() {
             start = 0;
             end = 0;
         }
    Interval(int s, int e) {
        start = s;

        end = e;
    }

    public String toString() {
        return "( " +start+" , " +end +" )";
    }

     }

