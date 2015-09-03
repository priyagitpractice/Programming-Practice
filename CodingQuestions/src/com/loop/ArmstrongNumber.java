package com.loop;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main (String [] arg){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		
		int temp = no;
		String t = temp + "" ;
		int sum = 0;
		int length = t.length();
		
		while ( temp !=0){
			int digit = temp%10;
			sum = sum + (int) Math.pow(digit, length);
		    temp = temp/10;
			
		}
		
		if(sum==no){
			System.out.println( "it is an armstrong number");
		}
		else
			System.out.println( "it is not an armstrong number");
	}

}
