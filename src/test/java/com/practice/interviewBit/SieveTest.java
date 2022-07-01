package com.practice.interviewBit;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by akasshukla on 10/22/16.
 */
public class SieveTest {
    @Test
    public void sieve() throws Exception {
            Assertions.assertArrayEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97).toArray(),
                    Sieve.sieve(100).toArray());
    }

    @Test
    public void isPrime() throws Exception {
        assertTrue(Prime.isPrime(2));
    }
}