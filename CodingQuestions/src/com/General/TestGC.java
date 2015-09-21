package com.General;

public class TestGC {
	
	String str;
	int id;

	public TestGC(int id, String str) {
	this.str = str;
	this.id = id;
	}

	protected void finalize() {
	System.out.println("GC object " + id + " has been finalized.");
	}


	public static void main(String[] args) {		
		TestGC gc= new TestGC (123, "abcd");
        gc.finalize();
}
	
}




