package com.practice.interviewBit;

import com.practice.interviewBit.MaxSet;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class MaxSetTest {
    @Test
    public void maxset() throws Exception {
            ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1,2,5,-7,2,5));
            MaxSet a = new MaxSet();
            assertThat(Arrays.asList(1, 2, 5), is(a.maxset(b)));
    }

}