package com.General;

public class StaticExample {

		   static int num;  // Static variable
		   static String quote; // Static variable
		   
		   
		   //First Static block
		   static{
		      System.out.println("Static Block 1");
		      num = 68;
		      quote = "Block1";
		  } 
		   
		  //Second static block
		  static{
		      System.out.println("Static Block 2");
		      num = 98;
		      quote = "Block2";
		  }
		  
		  public static void main(String args[])
		  {
		      System.out.println("Value of num="+num);
		      System.out.println("Value of quote="+quote);
		   }
		}


