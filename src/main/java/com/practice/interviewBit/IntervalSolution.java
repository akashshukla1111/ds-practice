package com.practice.interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by akash on 25/1/16.
 */
public class IntervalSolution {

    public static void main(String[] args) {
        IntervalSolution s = new IntervalSolution();
        System.out.println(s.insert(
                new ArrayList<>(Arrays.asList(
                        new Interval(3, 6),
                        new Interval(8,10)
                )),
                new Interval(1, 2)
        ));
    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if(newInterval.end<newInterval.start){
            newInterval.start = newInterval.start+newInterval.end;
            newInterval.end = newInterval.start-newInterval.end;
            newInterval.start=newInterval.start-newInterval.end;
        }
        int size = intervals.size();
        int j=0;
        int i;
        for( i=0 ;i<size; i++){
             if( newInterval.start < intervals.get(i).start){
                intervals.get(i).start =newInterval.start;
                 j=endValueSet(intervals, newInterval, size, i);
                 i++;
                 break;
             }else if(newInterval.start >= intervals.get(i).start && newInterval.start <= intervals.get(i).end){
                j= endValueSet(intervals, newInterval, size, i);
                 i++;
                 break;
             }
        }
          ArrayList<Interval> a= new ArrayList<Interval>();
         a.addAll(intervals.subList(0,i));
        if(j>0){
            a.addAll(intervals.subList(j,size));
        }else {
            a.add(newInterval);
        }
        return a;
    }

    private int endValueSet(ArrayList<Interval> intervals, Interval newInterval, int size, int i) {
        int j=i;
        while (++j< size){
            if(newInterval.end > intervals.get(j-1).end && newInterval.end< intervals.get(j).start){
                intervals.get(i).end = newInterval.end;
                break;
            }else if(newInterval.end >= intervals.get(j).start && newInterval.end<=intervals.get(j).end){
                intervals.get(i).end = intervals.get(j).end;
                j++;
                break;
            }
        }
        if(newInterval.end>intervals.get(j-1).end){
            intervals.get(i).end = newInterval.end;
        }else{
            intervals.get(i).end = intervals.get(j-1).end;
        }
    return j;
    }
}
