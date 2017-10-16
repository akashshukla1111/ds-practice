package com.hackerrank.paper;

public class FindTheDecimalDigit {

	public String findTheDigitAfterDecimal(int a , int b) {
	return decimalPoint(a, b);
	}


	private static String decimalPoint(int a, int b){
		int temp=a%b;
		String comps="";
		String result="";
		String s1 = String.valueOf(Integer.MAX_VALUE);

		while (compareString(comps,s1)){
			temp=(temp*10);
			result=result+temp/b;
			temp=temp%b;
			if (temp%b==0){
				return result;
			}
			comps=comps+temp;

		}
		return "inf";
	}

	private static boolean compareString(String s1, String s2){
		char[] v1 =s1.toCharArray();
		char[] v2=s2.toCharArray();
		if (v1.length>v2.length)
			return false;
		else if (v1.length==v2.length){
			int i=0;
			int size=v1.length;
			while (size>0){
				if (v1[i]==v2[i])
					continue;
				if (v1[i]<v2[i]){
					return true;
				}else{
					return false;
				}
			}
		}
		return true;
	}

}
