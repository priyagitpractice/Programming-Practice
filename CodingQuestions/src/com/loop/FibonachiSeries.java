package com.loop;

public class FibonachiSeries {

	public static void main(String[] args) {
		int prev = 1;
		int next = 1;
		int sum = 0;
	    
	    for (int i=1; i<=10;i++){
	    	System.out.println(prev);
	    	sum = prev + next;
	    	prev = next;
	    	next = sum;
	    }
		
		

	}

}
