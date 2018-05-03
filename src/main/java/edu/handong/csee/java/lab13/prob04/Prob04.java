package edu.handong.csee.java.lab13.prob04;

import java.util.Scanner;

public class Prob04 { // class Prob04

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String catName, dogName; // create String type member catName and dogName
		Master master = new Master(); // create Master type object master
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		System.out.printf("Enter the cat name and dog name: "); // print out "Enter the cat name and dog name: ""
		catName=keyboard.next(); // put the catName's value
		dogName=keyboard.next(); // put the dogName's value
		
		Cat cat = new Cat(catName); // create Cat type object cat and initialize the name value to catName value
		Dog dog = new Dog(dogName); // create Dog type object dog and initialize the name value to dogName value
		
		cat.getName(); // execute the method that print out cat's name value
		master.feed(cat); // execute the method that print out cat's feed value
		dog.getName(); // execute the method that print out dog's name value
		master.feed(dog); // execute the method that print out dog's feed value
	}
}
