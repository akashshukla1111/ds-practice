package com.practice.interviewBit;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class squareSumTest {
    @Test
    public void squareSum() throws Exception {
            Assertions.assertArrayEquals( asList(asList(6, 8)).toArray(), SquareSum.squareSum(100).toArray());
    }

}