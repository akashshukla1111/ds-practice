package com.interviewbit.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ankit on 25/1/16.
 */
public class Reach {


    public int coverPoint(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int i = X.size();
        int sum = 0;
        while (--i >= 1) {
            sum += Math.max(Math.abs(X.get(i) - X.get(i - 1)), Math.abs(Y.get(i) - Y.get(i - 1)));
        }
            return sum;
        }

}
