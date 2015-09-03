package com.String;

public class Substring {

	public static void main(String[] args) {
		 String original = "THIS IS GOOD PLACE";
		    
		    String oldWord = "GOOD";
		    
		    String newWord = "BAD";
		    
		    
		    int startindexVal = original.indexOf("GOOD");
		    int endindexVal = startindexVal + oldWord.length();
		    
		    if(startindexVal!=-1){
		    	
		    	original = original.substring(0, startindexVal) + newWord + original.substring(endindexVal); 
		    	
		    	System.out.print("The new String is " + original);
		    	
		
		    	
		    }
				
			}

		}