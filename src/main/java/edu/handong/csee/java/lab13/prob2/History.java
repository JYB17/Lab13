package edu.handong.csee.java.lab13.prob2;

public class History extends Book {
	private String Author;								// declare instance variable 'Author'
	
	public History(String Name, String Author) {
		super(Name);									// call variable 'Name' from 'Book'
		this.Author = Author;							// update instance variable 'Author' to parameter 'Author'
	}
	
	public String toString() {
		return super.toString() + "\n\tAuthor: " + Author;			// return the string value
	}
	
	public void Show() {
		System.out.println("<<<History>>>" + this.toString());			// print the result
	}
}
