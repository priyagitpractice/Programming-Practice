package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FindAndReplace 
{

	public static void main(String[] args) throws IOException
	{

		String search = "this";
		String replacement = "that";
	
		FileReader fr = new FileReader("C:\\Users\\Neil Natekar\\Desktop\\sample1.txt");
		String s;
		    BufferedReader br = new BufferedReader(fr);

		    while ((s = br.readLine()) != null) {
		        s.replaceAll("this", "that");
		        System.out.println(s);
		    }
		}
		
	}
		

		
