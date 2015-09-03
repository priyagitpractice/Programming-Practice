package com.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class Subtracr {

	public static void main(String[] args) throws NumberFormatException, IOException{


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the numbers to subtract");
        int num = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        
        System.out.println("x-y= "+ (num-num2));
        
        
       

	}

}
