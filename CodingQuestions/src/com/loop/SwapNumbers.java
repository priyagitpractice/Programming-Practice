package com.loop;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int a, b, temp;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers to swap");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before Swapping : " + "a =" + a + "b= " +b);
		
		temp = a;
		a = b ;
		b = temp ;
		
		System.out.println("After Swapping : " + "a= "+a + "b= " + b) ;
	

	}

}
