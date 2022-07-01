package com.paper.hackerEarth;

import com.paper.hackerearth.FindSmallestNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSmallestNumberTest {

		FindSmallestNumber smallestNumber = new FindSmallestNumber();
	@Test
	public void findTheSmallestElement() throws Exception {
		int expected = smallestNumber.findSmallest(12);
		assertEquals(expected, 26);
	}

	@Test
	public void findTheSamllestWhenNoSmallest() throws Exception {
		int expected =smallestNumber.findSmallest(99);
		assertEquals(expected, -1);
	}


}
