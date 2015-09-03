package com.String;

public class ThisIsNice {

	public static void main(String[] args) {
		
		String original ="this is nice";
		
		original = original.substring(0, 4) + "1 " + original.substring(5, 7) + "2 " + original.substring(8, original.length())+ "3 ";
		
		System.out.print(original);
	}	

}


	

		