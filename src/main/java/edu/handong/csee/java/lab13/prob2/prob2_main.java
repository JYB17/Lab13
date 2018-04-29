package edu.handong.csee.java.lab13.prob2;

public class prob2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics!", "ScienceWorld");
		History history = new History("What is History?", "E.H.Carr");
		
		book.Show();
		science.show();
		history.show();
	}
}
