package com.file;

import java.io.File;

public class ListofFiles {

	public static void main(String[] args) {
		 
		String path = "."; 
		 
		  String files;
		  File f = new File("C:\\Users\\Neil Natekar\\Desktop\\sample1.txt");
		  File[] listOfFiles = f.listFiles(); 
		 
		  for (int i = 0; i < listOfFiles.length; i++) 
		  {
		 
		   System.out.println(listOfFiles[i].getName())	 ;

	}

}
		  
	}
	

