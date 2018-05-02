package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class prob4_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String catName, dogName;									// declare variables 'catName', 'dogName'
		
		Master master = new Master();								// instantiate object 'Master' to 'master'
		Cat cat = new Cat();										// instantiate object 'Cat' to 'cat'
		Dog dog = new Dog();										// instantiate object 'Dog' to 'dog'
		
		Scanner keyboard = new Scanner(System.in);					// create an object of 'Scanner' class, 'keyboard'
		
		System.out.print("Enter the cat name and dog name: ");		
		catName = keyboard.next();
		dogName = keyboard.next();										// getting the input 'catName' and 'dogName' from user
		
		cat.setName(catName);											// call method 'setName' and set parameter to 'catName' of object 'cat'
		cat.getName();													// call method 'getName' of object 'cat'
		master.feed(cat);										// call method 'feed' and set parameter to 'cat' of object 'master'
		
		dog.setName(dogName);											// call method 'setName' and set parameter to 'dogName' of object 'dog'
		dog.getName();										// call method 'getName' of object 'dog'
		master.feed(dog);									// call method 'feed' and set parameter to 'dog' of object 'master'

	}

}
