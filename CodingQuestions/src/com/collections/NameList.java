package com.collections;

import java.util.*;

public class NameList {
	
	/*To create an arraylist and add elements to it.
		--> To search for an element in the list.
		--> To print the elements of the list using iterator.
		--> To print the elements in the reverse order using ListIterator.*/

	public static void main(String[] args) {
		
		    ArrayList <String> names = new ArrayList<String>();
		    names.add("Amy");
		    names.add("Bob");
		    names.add("Cindy");
		    names.add("Neil");
		    System.out.println("names: " +names);
		    
		    boolean found = names.contains("bob");
		    System.out.println("the list comtains : " + found);
		    
		    Iterator <String> it = names.iterator();
		    while(it.hasNext()){
		    String nam = it.next();
		    System.out.println("First Name: "+ nam);}
		   
		    ListIterator <String> li = names.listIterator();
		    while (li.hasPrevious()){
		    	System.out.println(li.previous());
		    
		 
		    }
		  
		   
		    	
		      }
	
}
	    
	
	
	       
		