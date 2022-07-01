package com.practice.interviewBit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Created by akasshukla on 10/22/16.
 */
public class BinaryBitTest {
    @Test
    public void findDigitsInBinary() throws Exception {
            BinaryBit binaryBit=new BinaryBit();
            Assertions.assertEquals("1111",binaryBit.findDigitsInBinary(15));
    }
}