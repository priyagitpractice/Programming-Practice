package com.file;

import java.io.Console;

public class consoleDivide {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("Enter the first number: ");
		int num = Integer.parseInt(console.readLine());
		 
		System.out.print("Enter the second number: ");
		int num2  = Integer.parseInt(console.readLine());
		 
		System.out.println("num/num2");
	}
	
}


		
