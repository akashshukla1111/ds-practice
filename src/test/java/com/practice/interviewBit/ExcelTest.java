package com.practice.interviewBit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created by akasshukla on 10/22/16.
 */
public class ExcelTest {

    @Test
    public void titleToNumber() throws Exception {
            Excel a = new Excel();
            Assertions.assertEquals(731,a.titleToNumber("ABC"));
    }
}