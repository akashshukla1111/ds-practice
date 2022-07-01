package com.practice.interviewBit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class MaxSetTest {
    @Test
    public void maxset() throws Exception {
            ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1,2,5,-7,2,5));
            MaxSet a = new MaxSet();
            Assertions.assertArrayEquals(Arrays.asList(1, 2, 5).toArray(), a.maxset(b).toArray());
    }

}