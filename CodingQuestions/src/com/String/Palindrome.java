package com.String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original;
		String reverse= " ";
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the word");
		original = sc.nextLine();
		
		int length = original.length();
		

		for (int i= original.length()-1 ; i>=0 ; i--){
			
			reverse = reverse + original.charAt(i);
			}
		
		if(reverse.equals(original)){
			System.out.print("the word is a palindrome");}
			else{
				System.out.print("the word is not a palindrome");	}
			
			
		}
	
}
		


	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

