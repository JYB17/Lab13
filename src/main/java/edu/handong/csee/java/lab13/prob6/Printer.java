package edu.handong.csee.java.lab13.prob6;

public class Printer {
	public static void print(Object object) {
		String str = object.toString();				// declare variable 'str' and set method 'toString' of parameter 'object'
		
		if(object instanceof CapitalPrint) {
			str = str.toUpperCase();					// if 'object' is instance of 'CapitalPrint' update 'str' by calling method 'UpperCase' of 'str'
		}
		
		System.out.println(str);					// print the result
	}
}
