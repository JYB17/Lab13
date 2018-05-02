package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Equals {
	public static boolean equals(int[][] m1, int[][] m2) {
		int count=0;												// declare variable 'count' and set to 0
		
		if(m1.length != m2.length) {
			return false;							// if m1.length is not equal to m2.length, return false
		}
		
		for(int i=0; i<m1.length; i++) {				// repeat from i=0 while i<m1.length and increment i
			for(int j=0; j<m1[i].length; j++) {			// repeat from j=0 while j<m1.length and increment j
				if(m1[i][j] != m2[i][j])
					count++;							// if m1[i][j] is not equal to m2[i][j], increment 'count'
			}
		}
		
		if(count <= 3)
			return true;							// if count is 3 or less than 3, return true
		else
			return false;							// else, return false
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;										// declare variables 'n1', 'n2' and initiate to 0
		
		Scanner keyboard = new Scanner(System.in);			// create an object of 'Scanner' class, 'keyboard'
		
		System.out.print("Enter row size(maximum 5): ");			
		n1 = keyboard.nextInt();											// getting the input 'n1' from user(row size)
		
		System.out.print("Enter column size(maximum 5): ");
		n2 = keyboard.nextInt();										// getting the input 'n2' from user(column size)
		
		int [][] m1 = new int [n1][n2];									// declare 2d-array 'm1' with the size 'n1' and 'n2'
		
		System.out.print("Enter row size(maximum 5): ");
		n1 = keyboard.nextInt();									// getting the input 'n1' from user(row size)
		
		System.out.print("Enter column size(maximum 5): ");
		n2 = keyboard.nextInt();										// getting the input 'n2' from user(column size)
		
		int[][] m2 = new int[n1][n2];								// declare 2d-array 'm2' with the size 'n1' and 'n2'
		
		System.out.print("Enter List1: ");						// getting input from user repeatedly
		for(int i=0; i<m1.length; i++) {					// repeat from i=0 while i<m1.length and increment i
			for(int j=0; j<m1[i].length; j++) {					// repeat from j=0 while j<m1.length and increment j
				m1[i][j] = keyboard.nextInt();				// getting input m1[i][j] from user
			}
		}
		
		System.out.print("Enter List2: ");							// getting input from user repeatedly
		for(int i=0; i<m2.length; i++) {						// repeat from i=0 while i<m2.length and increment i
			for(int j=0; j<m2[i].length; j++) {					// repeat from j=0 while j<m1.length and increment j
				m2[i][j] = keyboard.nextInt();
			}
		}
		
		for(int i=0; i<m1.length; i++) {							// repeat from i=0 while i<m1.length and increment i
			for(int j=0; j<m1[i].length; j++) {						// repeat from j=0 while j<m1.length and increment j
				System.out.print(m1[i][j] + " ");			// print the inputs
			}
			System.out.println();						// change line
		}
		System.out.println();
		
		for(int i=0; i<m2.length; i++) {									// repeat from i=0 while i<m2.length and increment i
			for(int j=0; j<m2[i].length; j++) {						// repeat from j=0 while j<m2.length and increment j
				System.out.print(m2[i][j] + " ");				// print the inputs
			}
			System.out.println();								// change line
		}
		System.out.println();						// change line
		
		if(equals(m1, m2)) {
			System.out.println("The two arrays are approximately identical.");		// if the address of m1 and m2 is equal, print
		}
		else {
			System.out.println("The two arrays are not identical.");		// else, print
		}
	}

}
