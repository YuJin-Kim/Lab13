package edu.handong.csee.java.lab13.prob04;

public class Dog extends Animal implements Pet { // Dog class inherits Animal class and has interface Pet class
	
	public Dog(String name) { // Dog constructor
		super(name); // apply Animal constructor that Dog class inherits about name
	}
	
	public String food() { // method that return the dog's food
		return "(Dog!)Sausage"; // return String "(Cat!)Fish"
	}
	
}
