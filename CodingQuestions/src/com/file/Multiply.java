package com.file;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class Multiply {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		DataInputStream d= new DataInputStream(System.in);
		System.out.println("Enter the numbers");

        int num = Integer.parseInt(d.readLine());
        int num2 = Integer.parseInt(d.readLine());
        
        System.out.println("x X y = "+ (num*num2));
		
		
	}

}
