package com.collection.practicejava.redmart;

import java.util.Stack;

public class SpreadsheetUtils {

	public double calculateExpression(String[] val) {
		int l = val.length;
		int i = 0;
		Stack<Double> stack = new Stack<>();
		while (i < l) {
			String vl = val[i];
			String decimalPattern = "[0-9]*\\.?[0-9]*";
			if (vl.matches(decimalPattern)) {
				stack.push(Double.parseDouble(vl));
			}
			else {
				if (stack.size() >= 2) {
					Double st1 = stack.pop();
					Double st2 = stack.pop();
					if (vl.equals("*"))
						stack.push(st2 * st1);
					else if (vl.equals("/"))
						stack.push(st2 / st1);
					else if (vl.equals("+"))
						stack.push(st2 + st1);
					else if (vl.equals("-"))
						stack.push(st2 - st1);
				}
			}
			i++;
		}
		return stack.pop();
	}

	public int calculateRowIndex(String val) {
		int sum = 0;
		int length = val.length();
		for (int i = 0; i < length; i++) {
			int index = val.charAt(i) - 64;
			sum = 26 * sum + index;
		}
		return sum;
	}
}
