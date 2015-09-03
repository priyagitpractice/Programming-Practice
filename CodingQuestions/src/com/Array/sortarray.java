package com.Array;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		
		int [] arr = {12,4,1,7,10,21};
		
		for ( int i=0; i< arr.length ; i++){
			
			System.out.println("original Array is: " + arr[i]);
		}
		
     Arrays.sort(arr);
     
     for ( int i=0; i< arr.length ; i++){
		System.out.println("Sorted Array is: " + arr[i]);

     }
     
	}

}
