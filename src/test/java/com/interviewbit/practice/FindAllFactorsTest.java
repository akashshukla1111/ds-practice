package com.interviewbit.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertThat;

/**
 * Created by akasshukla on 10/22/16.
 */
public class FindAllFactorsTest {
    @Test
    public void findAllFactors() throws Exception {

        List<Integer> list= Arrays.asList(1, 2, 3, 4, 6, 8, 12, 24);
        FindAllFactors findAllFactors = new FindAllFactors();
        assertThat(list, is(findAllFactors.findAllFactors(24)));
    }

}