package edu.handong.csee.java.lab13.prob06;

public class Prob06 { // class Prob06

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UpPoint p1 = new UpPoint(3, 3); // create UpPoint type object p1 and initialize the x value to 3, the y value to 3
		DownPoint p2 = new DownPoint(2, 5);  // create DownPoint type object p2 and initialize the x value to 2, the y value to 5
		DownPoint p3 = new DownPoint(4, 7);  // create DownPoint type object p3 and initialize the x value to 4, the y value to 7
		UpPoint p4 = new UpPoint(9, 12);  // create UpPoint type object p4 and initialize the x value to 9, the y value to 12
		Printer printer = new Printer(); // create Printer type object printer
		
		Printer.print(p1); // execute the method that print out information about UpPoint p1
		Printer.print(p2); // execute the method that print out information about DownPoint p2
		Printer.print(p3); // execute the method that print out information about DownPoint p3
		Printer.print(p4); // execute the method that print out information about UpPoint p4
	}

}
