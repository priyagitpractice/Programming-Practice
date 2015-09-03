package com.loop;

public class PrimeNumber {
	
	public static boolean isPrime(int a){
		
		boolean isPrime = true;
		
	for( int i=2 ; i<=a ; i++){
		
		if( a % 2 == 0)
			
			 isPrime = false;
		
	}
		return isPrime;
	}

	public static void main(String[] args) {
		
		System.out.println ( " Is 20 a Prime Number?  " + isPrime(20));
		
		

	}

}
