package edu.handong.csee.java.lab13.prob02;

public class Book { // class Book
	int id; // create int type member id
	static int idCount=1; // create static int type member idCount and initialize to 1
	String name; // create String type member name
	
	public Book(String name) { // Book constructor
		id=idCount++; // put the value that idCount increase 1 to id
		this.name=name; // name put to this Book member name
	}
	
	public void show() { // method that print out Book information
		System.out.println("<<<BOOK>>>"); // print out "<<<BOOK>>>"
		System.out.println("   Id: "+id); // print out "   Id: " and id value
		System.out.println("   Book Name: "+name); // print out "   Book Name: " and name value
	}
}
