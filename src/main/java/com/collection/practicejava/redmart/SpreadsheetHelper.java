package com.collection.practicejava.redmart;

import java.util.Objects;

public class SpreadsheetHelper {

	public static boolean isArithmeticOperator(String cellVal) {
		return cellVal.equals("*") || cellVal.equals("/") || cellVal.equals("+") || cellVal.equals("-");
	}

	public static String[] splitLetterDigits(String cellVal) {
		return cellVal.split("(?<=\\D)(?=\\d+\\b)");
	}

	public static boolean isExpression(String[] value) {
		return Objects.nonNull(value) && (value.length > 1);
	}

	public static boolean isReference(String val) {
		char isAlph = val.charAt(0);
		return isAlph >= 'A' && isAlph <= 'Z';
	}
}
