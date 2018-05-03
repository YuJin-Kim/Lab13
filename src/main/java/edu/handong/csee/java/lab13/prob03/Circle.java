package edu.handong.csee.java.lab13.prob03;

public class Circle extends Shape {
	double radius;
	
	public double computeArea() {
		return radius*radius*Math.PI;
	}
	
	public double computePerimeter() {
		return radius*2*Math.PI;
	}
	
}
