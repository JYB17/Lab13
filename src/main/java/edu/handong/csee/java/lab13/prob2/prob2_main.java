package edu.handong.csee.java.lab13.prob2;

public class prob2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Simple Book");									// instantiate object 'Book' to 'book' and set the parameter 'Simple Book'
		Science science = new Science("Hello Physics!", "ScienceWorld");		// instantiate object 'Science' to 'science' and set the parameter "Hello Physics!", "ScienceWorld"
		History history = new History("What is History?", "E.H.Carr");			// instantiate object 'History' to 'history' and set the parameter "What is History?", "E.H.Carr"
		
		book.Show();				// call method 'Show()' of object 'book'
		science.Show();				// call method 'Show()' of object 'science'
		history.Show();				// call method 'Show()' of object 'history'
	}
}
