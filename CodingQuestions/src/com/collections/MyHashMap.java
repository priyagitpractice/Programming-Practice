package com.collections;

import java.util.HashMap;
import java.util.Set;



public class MyHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm= new HashMap<String, String> ();
		
		hm.put("first", "first inserted");
		hm.put("second", "second inserted");
		hm.put("third", "third inserted");
		
		System.out.println(hm);
		
		Set<String> keys = hm.keySet();
		for( String key : keys){
			System.out.println(key);
		}
		

	}

}
