package com.Accessmodifier;

public class book {
	
	private int bookId;
	String title = "key";
	protected String yearPublished;
	public int price;
	


	public static void main(String[] args) {
		book b = new book();
		System.out.println(b.title);
		System.out.println(b.bookId);
		System.out.println(b.price);

	}

}
