package com.String;

public class ReverseString {

	public static void main(String[] args) {
String original = "this is that";

String reverse = "";

int length = original.length();

for (int i= original.length()-1 ; i>=0 ; i--){
	
	reverse = reverse + original.charAt(i);
}

System.out.println("reverse of the string is: " + reverse);
}

}
