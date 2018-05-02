package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	private String publisher;								// declare instance variable 'publisher'
	
	public Science(String Name, String Publisher) {
		super(Name);										// call variable 'Name' from 'Science'
		this.publisher = Publisher;							// update instance variable 'publisher' to parameter 'Publisher'
	}
	
	public String toString() {
		return super.toString() + "\n\tPublisher: " + publisher;	// return the string value
	}
	
	public void Show() {
		System.out.println("<<<Science>>>" + this.toString());			// print the result
	}
}
