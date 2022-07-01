package com.paper.hackerEarth;

import com.paper.hackerearth.FindNoOfBroadCasts;
import org.junit.Assert;
import org.junit.Test;

public class FindNoOfBroadCastsTest {

	private Integer[] arr = { 1, 3, 2, 2, 1, 2 };
	private FindNoOfBroadCasts casts = new FindNoOfBroadCasts();

	@Test
	public void noOfBroadCasts() throws Exception {
		int noOflikes = casts.getNoOflikes(arr, 1, 4, 2);
		Assert.assertEquals(noOflikes, 2);
	}
}