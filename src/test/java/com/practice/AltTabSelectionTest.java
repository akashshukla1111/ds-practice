package com.practice;

import com.practice.mics.AltTabSelection;
import org.junit.Test;

/**
 * Created by akasshukla on 7/31/17.
 */
public class AltTabSelectionTest {

	@Test
	public void testinf() throws Exception {

		AltTabSelection ng = new AltTabSelection();
		int[] ints = ng.altTab(4, 3, new int[] { 1, 2, 3, 4 });
		int[] arr = ng.altTab(10, 7, new int[] { 1, 2, 3, 4 ,5,6,7,8,9,10});
		for (int i:arr
			 ) {
			System.out.print(i+" ");
		}
	}
}