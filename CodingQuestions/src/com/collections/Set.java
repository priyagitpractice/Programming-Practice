package com.collections;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {

		String[] strArray = { "abc", "def", "ghi", "abd" };

		HashSet<String> unique = new HashSet<String>();

		for (String str : strArray) {
			if (!unique.add(str)){

			{
				System.out.println("Duplicate Elemet is: + str");
			}
		}

	}

}
	
}
