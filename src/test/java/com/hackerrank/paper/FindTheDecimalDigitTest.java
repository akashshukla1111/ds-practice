package com.hackerrank.paper;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDecimalDigitTest {
	@Test
	public void findTheDigitAfterDecimal() throws Exception {

		FindTheDecimalDigit findTheDecimalDigit=new FindTheDecimalDigit();
		Assert.assertEquals("inf" ,findTheDecimalDigit.findTheDigitAfterDecimal(36,7));
		Assert.assertEquals("875" ,findTheDecimalDigit.findTheDigitAfterDecimal(95,8));
		Assert.assertEquals("0" ,findTheDecimalDigit.findTheDigitAfterDecimal(66,6));

	}

}