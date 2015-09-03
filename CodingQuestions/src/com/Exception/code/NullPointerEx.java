package com.Exception.code;

public class NullPointerEx {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
				System.out.println("Length of the String: " + s.length());
		}	 
		catch (NullPointerException e){
			System.out.println("this is the catch block");
		}
	finally {
		System.out.print("this is the finally block");
	}

	}

}
