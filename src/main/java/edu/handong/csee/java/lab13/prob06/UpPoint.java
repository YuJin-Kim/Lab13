package edu.handong.csee.java.lab13.prob06;

public class UpPoint implements CapitalPrint {
	int x, y;
	
	public UpPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void print() {
		System.out.println("X : "+x+" Y : "+y);
	}
	
}
