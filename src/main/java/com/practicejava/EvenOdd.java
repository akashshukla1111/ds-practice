package com.practicejava;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println(getResultString("12345678"));

	}

	static String getResultString(String input){

		StringBuilder rs=new StringBuilder();
		rs.append(input.charAt(0));
		for (int i=0; i<input.length()-1;i++){

			int v1 = Character.getNumericValue(input.charAt(i));
			int v2 = Character.getNumericValue(input.charAt(i+1));

			if (v1%2==0 && v2%2==0 ){
				rs.append("*"+v2);

			}else if((v1%2!=0 && v2%2!=0)){
				rs.append("-"+v2);
			}
			else {
				rs.append(v2);
			}
		}
		return rs.toString();
	}
}
