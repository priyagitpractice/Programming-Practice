package com.String;

public class ReverseWord {

	public static void main(String[] args) {
		String input = "this is that";
		
		String output = "";
		
		String [] arr = input.split(" ");
		
		for (int i=arr.length-1 ; i>=0 ; i-- ){
			
			output= output + arr [i] + " ";
		}
				
		System.out.print(output);

	}

}
