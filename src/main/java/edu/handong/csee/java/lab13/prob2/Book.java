package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int idCount=0;				// declare private instance variable 'idCount' and initiate to 0
	private String bookName;					// declare private instance variable 'bookName'
	private int id;								// declare private instance variable 'id'
	
	public Book(String Name) {
		this.bookName = Name;					// update instance variable 'bookName' to parameter 'Name' using "this"
		idCount++;								// increment 'idCount'
		id = idCount;							// update instance variable 'id' to updated 'idCount'
	}
	
	public String toString() {
		return "\n\tId: " + id + "\n\tBook Name: " + bookName;				// return the string value
	}
	
	public void Show() {
		System.out.println("<<<BOOK>>>" + this.toString());					// print the book name
	}
}
