package edu.handong.csee.java.lab13.prob03;

import java.util.Scanner;

public class Prob03 { // class Prob03

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(); // create Circle type object circle
		Rectangle rectangle = new Rectangle(); // create Rectangle type object rectangle
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		System.out.print("Enter radius: "); // print out "Enter radius: "
		circle.radius = keyboard.nextDouble(); // put the circle's radius value
		System.out.println("Radius: "+circle.radius); // print out "Radius: " and circle's radius value
		circle.show(); // execute the method that print out information(area, perimeter) about circle
		
		System.out.print("Enter length and width: "); // print out "Enter length and width: "
		rectangle.length = keyboard.nextDouble(); // put the rectangle's length value
		rectangle.width = keyboard.nextDouble(); // put the rectangle's width value
		System.out.println("Length: "+rectangle.length); // print out "Length: " rectangle's length value
		System.out.println("Width: "+rectangle.width); // print out "Width: " and rectangle's width value
		rectangle.show(); // execute the method that print out information(area, perimeter) about rectangle
		
	}

}
