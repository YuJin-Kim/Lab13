package edu.handong.csee.java.lab13.prob06;

public class DownPoint implements CapitalPrint{
	int x, y;
	
	public DownPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void print() {
		System.out.println("x : "+x+" y : "+y);
	}
	
}
