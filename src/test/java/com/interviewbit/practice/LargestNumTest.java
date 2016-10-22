package com.interviewbit.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by akasshukla on 10/22/16.
 */
public class LargestNumTest {
    @Test
    public void largestNumber() throws Exception {
            LargestNum n =new LargestNum();
            assertEquals("886",n.largestNumber(new ArrayList<>(Arrays.asList(86,8))));
    }

}