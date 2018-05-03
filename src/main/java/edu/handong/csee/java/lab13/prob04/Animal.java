package edu.handong.csee.java.lab13.prob04;

public class Animal { // class Animal
	String name; // create String type member name
	
	public Animal(String name) { // Book constructor
		this.name=name; // name put to this Animal member name
	}
	
	public void getName() { // method that print out animal's name
		System.out.println("Name: "+name); // print out "Name: " and name value
	}
	
}
