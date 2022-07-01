package com.practice.interviewBit;

import com.practice.interviewBit.MaxContiguiousSum;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by akasshukla on 10/22/16.
 */
public class MaxContiguiousSumTest {
    @Test
    public void maxSubArray() throws Exception {
            MaxContiguiousSum m=new MaxContiguiousSum();
             assertEquals(-1,m.maxSubArray(new ArrayList<>(Arrays.asList(-2, -1, -3, -4, -1, -2, -1, -5, -4))));

    }

}