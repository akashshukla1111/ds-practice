package com.interviewbit.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class ReachTest {
    @Test
    public void coverPoint() throws Exception {
            Reach r = new Reach();
            assertEquals(108,r.coverPoint(new ArrayList<>(Arrays.asList(4, 8, -7, -5, -13, 9, -7, 8)),
                    new ArrayList<>(Arrays.asList( 4, -15, -10, -3, -13, 12, 8, -8 ))));

    }

}