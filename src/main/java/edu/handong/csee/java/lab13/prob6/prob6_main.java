package edu.handong.csee.java.lab13.prob6;

public class prob6_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpPoint p1 = new UpPoint(2, 3);						// instantiate object 'UpPoint' to 'p1' and set parameter to 2,3
		DownPoint p2 = new DownPoint(2, 5);					// instantiate object 'DownPoint' to 'p2' and set parameter to 2,5
		DownPoint p3 = new DownPoint(3, 8);					// instantiate object 'DownPoint' to 'p3' and set parameter to 3,8
		UpPoint p4 = new UpPoint(6, 13);					// instantiate object 'UpPoint' to 'p4' and set parameter to 6,1
		
		Printer.print(p1);
		Printer.print(p2);
		Printer.print(p3);
		Printer.print(p4);							// call method 'print' of object 'Printer' of p1, p2, p3, p4

	}

}
