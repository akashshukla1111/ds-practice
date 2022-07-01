package com.practice.interviewBit;

import com.practice.interviewBit.InsertionSort;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akasshukla on 10/22/16.
 */
public class InsertionSortTest {
    @Test
    public void insertionSort() throws Exception {
            List<Integer> list = new ArrayList<>(Arrays.asList(2,5,4,9,7,8));
            Assertions.assertArrayEquals(new Integer[]{2, 4, 5, 7, 8, 9}, InsertionSort.insertionSort(list).toArray());

    }

}