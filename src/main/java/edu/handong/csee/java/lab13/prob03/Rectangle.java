package edu.handong.csee.java.lab13.prob03;

public class Rectangle extends Shape { // Rectangle class inherits Shape class
	double length; // create double member length
	double width; // create double member width

	public double computeArea() { // method that compute the area of rectangle
		return length*width; // return the rectangle's area value
	}
	
	public double computePerimeter() { // method that compute the perimeter of rectangle
		return (length+width)*2; // return the rectangle's perimeter value
	}
	
}
