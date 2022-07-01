package com.hackerrank.practice;
	
    /*
		Created By : akasshukla
              Date : 1/17/18   1:31 AM
    */

import java.util.Arrays;
import java.util.Stack;

public class GoldmanSachs {

	public static void main(String[] args) {

		//1st question
		int[] array = { 1, 43218 };
		System.out.println(findQualifiedNumbers(array));


		// 2nd Question
		System.out.println(PrintMinNumberForPattern("D".toCharArray()));


	}

	static String findQualifiedNumbers(int[] numberArray) {

		int length = numberArray.length;
		int j = 0;
		int[] farray = new int[length];
		for (int i = 0; i < length; i++) {
			if (containNumber(numberArray[i])) {
				farray[j] = numberArray[i];
				j++;
			}
		}

		String result = "-1";
		if (farray.length > 0) {
			Arrays.sort(farray);
			result = "";
			for (int i = 0; i < farray.length - 1; i++) {
				if (farray[i]==0) continue;
				result += farray[i] + ",";
			}
			result = result + farray[farray.length - 1];
		}
		return result;

	}

	public static boolean containNumber(int number) {
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		int digit;
		while (number > 0) {
			digit = number % 10;
			if (digit == 1) {
				flag1 = true;
			}
			if (digit == 2) {
				flag2 = true;
			}
			if (digit == 3) {
				flag3 = true;
			}
			number = number / 10;
		}
		if (flag1 && flag2 && flag3) {
			return true;
		}
		return false;
	}


	//

	public static String PrintMinNumberForPattern(char[] seq)
	{
		// result store output string
		String result="";

		// create an empty stack of integers
		Stack<Integer> stk=new Stack<>();

		// run n+1 times where n is length of input sequence
		for (int i = 0; i <= seq.length; i++)
		{
			// push number i+1 into the stack
			stk.push(i + 1);

			// if all characters of the input sequence are
			// processed or current character is 'I'
			// (increasing)
			if (i == seq.length || seq[i] == 'I')
			{
				// run till stack is empty
				while (!stk.empty())
				{
					// remove top element from the stack and
					// add it to solution
					result += stk.peek().toString();
					result += "";
					stk.pop();
				}
			}
		}
		return result;
	}

}
    
    