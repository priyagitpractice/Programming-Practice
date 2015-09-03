package com.file;

import java.util.Scanner;

public class IOExample {

	public static void main(String[] args){

		int x;
		int y;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers to add");
		x= sc.nextInt();
		y= sc.nextInt();
		
		System.out.println("x+y= "+(x+y));
	}
}
		
		
		

