package com.Array;

public class LargestNo {

	public static void main(String[] args) {
		
		int [] arr = new int [] {16,30, 5,90, 15};
		
		int largest = arr[0];
		
		for ( int i=1; i< arr.length; i++){
			
			if (largest < arr [i]) 
				largest = arr [i];
		}	
      System.out.println("the largest number is  " + largest);
	}

}
