package edu.handong.csee.java.lab13.prob04;

public class Cat extends Animal implements Pet { // Cat class inherits Animal class and has interface Pet class
	
	public Cat(String name) { // Cat constructor
		super(name); // apply Animal constructor that Cat class inherits about name
	}
	
	public String food() { // method that return the cat's food
		return "(Cat!)Fish"; // return String "(Cat!)Fish"
	}
	
}
