package com.collections;

import java.util.HashMap;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {

				
				HashMap<String, Integer> hm= new HashMap<String, Integer> ();
				
				hm.put("java", 20);
				hm.put("Unix", 45);
				hm.put("Mac", 2);
				hm.put("C++", 8);
				
				Set<String> keys = hm.keySet();
				for( String key : keys){
					System.out.println(key);
				}
				

			}

}	