package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape {
	private double length;												// declare instance variable 'length'
	private double width;												// declare instance variable 'width'
	
	public Rectangle(double length, double width) {
		this.length = length;											// update instance variable 'length' to parameter 'length'
		this.width = width;												// update instance variable 'width' to parameter 'width'
	}
	
	public double area() {
		return length*width;											// return the value of area of rectangle with 'length' and 'width'
	}
	
	public double perimeter() {
		return 2*(length+width);										// return the value of perimeter of rectangle with 'length' and 'width'
	}
	
	public double getLength() {
		return length;													// return the value of length
	}
	
	public double getWidth() {
		return width;													// return the value of width
	}

}
