package com.practice.hackerRank;

import com.paper.hackerrank.FindTheDecimalDigit;
import org.junit.Assert;
import org.junit.Test;

public class FindTheDecimalDigitTest {
	@Test
	public void findTheDigitAfterDecimal() throws Exception {

		/*
		Find the floting digit
		first line input N
		second line space separated integer values
		return digit after decimal
		ex :
		input N=3
		4 2   return "0"
		14 3  return "inf"
		13 4  return "25"
		 */

		FindTheDecimalDigit findTheDecimalDigit=new FindTheDecimalDigit();
		Assert.assertEquals("inf" ,findTheDecimalDigit.findTheDigitAfterDecimal(36,7));
		Assert.assertEquals("875" ,findTheDecimalDigit.findTheDigitAfterDecimal(95,8));
		Assert.assertEquals("0" ,findTheDecimalDigit.findTheDigitAfterDecimal(66,6));

	}

}