package com.interviewbit.practice;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class SetZeroTest {
    @Test
    public void setZeroes() throws Exception {
            SetZero st = new SetZero();
            assertThat(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0,0)), new ArrayList<>(Arrays.asList(0,0)))),
                CoreMatchers.is( st.setZeroes(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1,1)), new ArrayList<>(Arrays.asList(0,0))))))
        );
    }

}