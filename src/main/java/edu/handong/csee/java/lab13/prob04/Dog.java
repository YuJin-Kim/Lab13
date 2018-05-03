package edu.handong.csee.java.lab13.prob04;

public class Dog extends Animal implements Pet {
	
	public Dog(String name) {
		super(name);
	}
	
	public String food() {
		return "(Dog!)Sausage";
	}
	
}
