package com.hackerearth.paper;

import org.junit.Assert;
import org.junit.Test;

public class FindSmallestNumberTest {

		FindSmallestNumber smallestNumber = new FindSmallestNumber();
	@Test
	public void findTheSmallestElement() throws Exception {
		int expected = smallestNumber.findSmallest(12);
		Assert.assertEquals(expected, 26);
	}

	@Test
	public void findTheSamllestWhenNoSmallest() throws Exception {
		int expected =smallestNumber.findSmallest(99);
		Assert.assertEquals(expected, -1);
	}


}
