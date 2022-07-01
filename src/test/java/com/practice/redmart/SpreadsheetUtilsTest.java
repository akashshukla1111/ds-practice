package com.practice.redmart;

import com.paper.redmart.SpreadsheetUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.equalTo;

public class SpreadsheetUtilsTest {

	private SpreadsheetUtils utils;

	@BeforeEach
	public void setup(){
		utils=new SpreadsheetUtils();
	}


	@Test
	public void calCulateRowIndexTest() throws Exception {
		int index = utils.calculateRowIndex("A");
		Assertions.assertEquals(index,1);
		int index1 = utils.calculateRowIndex("R");
		Assertions.assertEquals(index1,18);
		int index2 = utils.calculateRowIndex("BA");
		Assertions.assertEquals(index2,53);

	}

	@Test
	public void name() throws Exception {
		String[] ar = { "20.000", "3", "/", "2", "+" };
		double value = utils.calculateExpression(ar);
		Assertions.assertEquals(value,8.666666666666668);
	}

	@Test
	public void stringFormatter() throws Exception {
		Double d = 12.345299;
		d = Double.parseDouble(String.format("%.4f", d));
		Assertions.assertEquals(d,12.3453);
	}
}