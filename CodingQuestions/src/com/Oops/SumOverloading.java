package com.Oops;

public class SumOverloading {
	
		public void add(int a, int b)
		{
		            System.out.println("Sum of two="+(a+b));
		}

		public void add(int a, int b,int c)
		{
		            System.out.println("Sum of three="+(a+b+c));
		}
		public static void main(String args[]){
		SumOverloading s = new SumOverloading();
			s.add(10,15);
	         s.add(10,20,30);
	}
	
}


