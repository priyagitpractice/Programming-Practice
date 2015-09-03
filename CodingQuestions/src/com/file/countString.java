package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class countString 
{
	public static void main(String[] args) throws FileNotFoundException 
	{	
		int count = 0;
		String find = "this";
		File file = new File("sample1.txt");
		Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Neil Natekar\\Desktop\\sample1.txt"));	
		while(sc.hasNext())
		{
		    String word =  sc.next();
		    if (word.indexOf(find) >-1)
		    {
		    	count++;
		    }
		}
		System.out.println("Number of words: " + count);
	}	
}
