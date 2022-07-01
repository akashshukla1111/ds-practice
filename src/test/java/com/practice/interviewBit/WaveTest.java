package com.practice.interviewBit;

import com.practice.interviewBit.Wave;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class WaveTest {
    @Test
    public void wave() throws Exception {
            Wave v = new Wave();
            assertThat(asList(2, 1, 4, 3, 5), is( v.wave(new ArrayList<>(asList(5, 1, 3, 2, 4)))));
    }

}