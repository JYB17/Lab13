package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint {
	private int x, y;							// declare instance variables x, y
	
	UpPoint(int x, int y){
		this.x = x;							
		this.y = y;						//  update instance variables x, y to parameter x, y
	}
	
	public String toString() {
		return "x: " + x + " y: " + y;				// return the string value
	}
	
}
