package edu.handong.csee.java.lab13.prob06;

public class UpPoint implements CapitalPrint { // UpPoint class has interface CapitalPrint class
	int x, y; // create int type member x and y
	
	public UpPoint(int x, int y) { // UpPoint constructor
		this.x=x; // x put to this DownPoint member x
		this.y=y; // y put to this DownPoint member y
	}
	
	public void print() { // method that print out UpPoint
		System.out.println("X : "+x+" Y : "+y); // print out "X : " and x value, " Y : " and y value
	}
	
}
