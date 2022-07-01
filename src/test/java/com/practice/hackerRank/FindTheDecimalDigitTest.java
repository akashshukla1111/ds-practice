package com.practice.hackerRank;

import com.paper.hackerrank.FindTheDecimalDigit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals("inf" ,findTheDecimalDigit.findTheDigitAfterDecimal(36,7));
		Assertions.assertEquals("875" ,findTheDecimalDigit.findTheDigitAfterDecimal(95,8));
		Assertions.assertEquals("0" ,findTheDecimalDigit.findTheDigitAfterDecimal(66,6));

	}

}