package com.loop;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		
		int n =sc.nextInt();
		
		if (n%3==0 && n%5==0)
			System.out.println("ping-pong");
		
		else if (n%3==0)
			System.out.println("ping");
					
		else if (n%5==0)
				System.out.println("pong");
			
		
		
	}

}
