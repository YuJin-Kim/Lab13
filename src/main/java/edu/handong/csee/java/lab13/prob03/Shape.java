package edu.handong.csee.java.lab13.prob03;

public abstract class Shape {
	
	public abstract double computeArea();
	public abstract double computePerimeter();
	
	public void show() {
		System.out.println("Area: "+computeArea());
		System.out.println("Perimeter: "+computePerimeter()+"\n");
	}
	
}
