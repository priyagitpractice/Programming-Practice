package com.Oops;

public class AOverriding {
	public void cal(double x){
	{
	            System.out.println("square value="+(x*x));
	}
	}

public class B extends AOverriding{
	public void cal(double x)
	{
	            System.out.println("square root="+Math.sqrt(x));
	}
	}
	     
public static void main(String args[]){
	      {
	            AOverriding a = new AOverriding();
	            a.cal(15);
	            
	      }
}
}
	      

