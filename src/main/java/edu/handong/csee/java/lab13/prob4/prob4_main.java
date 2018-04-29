package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class prob4_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String catName, dogName;
		
		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the cat name and dog name: ");
		catName = keyboard.next();
		dogName = keyboard.next();
		
		cat.setName(catName);
		cat.getName();
		master.feed(cat);
		
		dog.setName(dogName);
		dog.getName();
		master.feed(dog);

	}

}
