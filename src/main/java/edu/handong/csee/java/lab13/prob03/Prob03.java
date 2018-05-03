package edu.handong.csee.java.lab13.prob03;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		circle.radius = keyboard.nextDouble();
		System.out.println("Radius: "+circle.radius);
		circle.show();
		
		System.out.print("Enter length and width: ");
		rectangle.length = keyboard.nextDouble();
		rectangle.width = keyboard.nextDouble();
		System.out.println("Length: "+rectangle.length);
		System.out.println("Width: "+rectangle.width);
		rectangle.show();
		
	}

}
