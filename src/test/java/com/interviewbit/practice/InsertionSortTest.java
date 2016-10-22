package com.interviewbit.practice;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

/**
 * Created by akasshukla on 10/22/16.
 */
public class InsertionSortTest {
    @Test
    public void insertionSort() throws Exception {
            List<Integer> list = new ArrayList<>(Arrays.asList(2,5,4,9,7,8));
            assertThat(Arrays.asList(2, 4, 5, 7, 8, 9), CoreMatchers.is(InsertionSort.insertionSort(list)));

    }

}