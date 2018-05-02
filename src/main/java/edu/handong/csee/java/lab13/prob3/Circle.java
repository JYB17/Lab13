package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {
	private double radius;									// declare instance variable 'radius'
	
	public Circle(double r) {
		radius = r;											// update 'radius' to parameter 'r'
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);					// return the value of area of circle with 'radius'
	}
	
	public double perimeter() {
		return 2.0*Math.PI*radius;							// return the value of perimeter of circle with 'radius'
	}
	
	public double getRadius() {
		return radius;										// return the value of radius
	}

}
