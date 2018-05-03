package edu.handong.csee.java.lab13.prob03;

public abstract class Shape { // abstract class shape
	
	public abstract double computeArea(); // abstract method that 
	public abstract double computePerimeter(); // abstract method that
	
	public void show() { // method that print out information about area and perimeter
		System.out.println("Area: "+computeArea()); // print out "Area: " and area's vlaue
		System.out.println("Perimeter: "+computePerimeter()+"\n"); // print out "Perimeter: " and perimeter's vlaue
	}
	
}
