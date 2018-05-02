package edu.handong.csee.java.lab13.prob6;

public class DownPoint {
	private int x, y;							// declare instance variable x, y
	
	DownPoint(int x, int y){
		this.x = x;								// update instance variable x to parameter x
		this.y = y;								// update instance variable y to parameter y
	}
	
	public String toString() {
		return "x: " + x + " y: " + y;			// print the string value
	}
	
}
