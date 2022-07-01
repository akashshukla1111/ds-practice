package com.practice.interviewBit;

import com.practice.interviewBit.Excel;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by akasshukla on 10/22/16.
 */
public class ExcelTest {

    @Test
    public void titleToNumber() throws Exception {
            Excel a = new Excel();
            Assert.assertEquals(731,a.titleToNumber("ABC"));
    }
}