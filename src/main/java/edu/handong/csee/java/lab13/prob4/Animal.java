package edu.handong.csee.java.lab13.prob4;

public class Animal {
	private String name;							// declare instance variable 'name'
	
	public void setName(String name) {
		this.name = name;								// update and instance variable 'name' to parameter 'name'
	}
	
	public void getName() {
		System.out.println("Name: " + name);			// get the 'name' and print the result
	}
}
