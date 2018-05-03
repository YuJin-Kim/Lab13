package edu.handong.csee.java.lab13.prob06;

public class DownPoint implements CapitalPrint{ // DownPoint class has interface CapitalPrint class
	int x, y; // create int type member x and y
	
	public DownPoint(int x, int y) { // DownPoint constructor
		this.x=x; // x put to this DownPoint member x
		this.y=y; // y put to this DownPoint member y
	}
	
	public void print() { // method that print out DownPoint
		System.out.println("x : "+x+" y : "+y); // print out "x : " and x value, " y : " and y value
	}
	
}
