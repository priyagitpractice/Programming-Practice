package com.Array;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,6,7,8,10};
				
		int x  = arr[0];
		
		for (int i= 0 ; i<arr.length; i++)
		{
			if (x != arr[i])
			{
				System.out.println("the missing no is = "+ x);
				x++;
			}
			
			x++;
		}
		
		

	}

}
