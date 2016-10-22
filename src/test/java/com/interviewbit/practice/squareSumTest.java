package com.interviewbit.practice;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class squareSumTest {
    @Test
    public void squareSum() throws Exception {
        System.out.println(is(SquareSum.squareSum(100)));
            assertThat( asList(asList(6, 8)), is(SquareSum.squareSum(100)));
    }

}