package edu.handong.csee.java.lab13.prob02;

public class Science extends Book { // Science class inherits Book class
	String publisher; // create String type member publisher
	
	public Science(String name, String publisher) { // Science constructor
		super(name); // apply Book constructor that Science class inherits about name
		this.publisher=publisher; // publisher put to this Science member publisher
	}
	
	public void show() { // method that print out Science book information
		System.out.println("<<<Science>>>"); // print out "<<<Science>>>"
		System.out.println("   Id: "+id); // print out "   Id: " and id value
		System.out.println("   Book Name: "+name); // print out "   Book Name: " and name value
		System.out.println("   Publisher: "+publisher); // print out "   Publisher: " and publisher value
	}
}
