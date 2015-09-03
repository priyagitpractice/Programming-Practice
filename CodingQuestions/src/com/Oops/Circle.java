package com.Oops;

public class Circle extends Shape implements ShapeConstants{
	
	public int radius;
	public double area;
	public int setSides;
	double pi = 3.14;

	public Circle (int numSides){
		setSides = numSides;
	}
	
	public double calculateArea(){
		area = pi*radius;
		return area;
	}
	
	public double calculatePerimeter(){
	 perimeter = 2*pi*radius;
	 return perimeter;
	}
	 
	 public void setSides(int sides){
	 noOfSides=sides;
	 }
	 
	 
	
}