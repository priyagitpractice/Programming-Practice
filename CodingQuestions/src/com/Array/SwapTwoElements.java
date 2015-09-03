package com.Array;

public class SwapTwoElements {

	public static void main(String[] args) {
		int [] arr = {1,2,5,6,4};
		
		int src= arr [2];
		int dest = arr[ 4];
		int temp = arr [2];
		
		arr [2] = dest;
		
		arr [4] = temp; 
		
		for (int i=0; i<arr.length; i++){
			
			System.out.println(arr[i]);
		}
	}

}
