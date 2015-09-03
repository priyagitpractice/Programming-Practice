package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) throws FileNotFoundException {
		
		int count=0;
		
		File file = new File("sample.txt");
		Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Neil Natekar\\Desktop\\sample.txt"));
		
		while(sc.hasNext()){
		    sc.next();
		    count++;
		}
		System.out.println("Number of words: " + count);
		
	}
	
}