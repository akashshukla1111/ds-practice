package com.interviewbit.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akasshukla on 10/22/16.
 */
public class BinaryBitTest {
    @Test
    public void findDigitsInBinary() throws Exception {
            BinaryBit binaryBit=new BinaryBit();
            Assert.assertEquals("1111",binaryBit.findDigitsInBinary(15));
    }
}