package edu.handong.csee.java.lab13.prob03;

public class Rectangle extends Shape {
	double length;
	double width;

	public double computeArea() {
		return length*width;
	}
	
	public double computePerimeter() {
		return (length+width)*2;
	}
	
}
