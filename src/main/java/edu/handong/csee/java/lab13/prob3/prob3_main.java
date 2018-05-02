package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;
public class prob3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2;												// declare variables 'n1', 'n2'
		
		Scanner keyboard = new Scanner(System.in);					// create an object of 'Scanner' class, 'keyboard'
		
		System.out.print("Enter radius: ");
		n1 = keyboard.nextDouble();									// getting the input 'n1'
		Circle c1 = new Circle(n1);									// instantiate object 'Circle' to 'c1' and set parameter 'n1'
		
		System.out.println("Radius: " + c1.getRadius());			// print the 'radius' value of c1
		c1.display();												// call method 'display' of c1
		
		System.out.print("Enter length and width: ");
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();									// getting the input 'n1' and 'n2'
		Rectangle r1 = new Rectangle(n1, n2);						// instantiate object 'Rectangle' to 'r1' and set parameter 'n1', 'n2'
		
		System.out.println("Length: " + r1.getLength());			
		System.out.println("Width: " + r1.getWidth());					// print the value of length and width of r1 by calling method 
		r1.display();													// call method 'display' of 'r1'

	}

}
