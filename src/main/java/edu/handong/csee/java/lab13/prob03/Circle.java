package edu.handong.csee.java.lab13.prob03;

public class Circle extends Shape { // Circle class inherits Shape class
	double radius; // create double type member radius
	
	public double computeArea() { // method that compute the area of circle
		return radius*radius*Math.PI; // return the circle's area value
	}
	
	public double computePerimeter() { // method that compute the perimeter of circle
		return radius*2*Math.PI; // return the circle's perimeter value
	}
	
}
