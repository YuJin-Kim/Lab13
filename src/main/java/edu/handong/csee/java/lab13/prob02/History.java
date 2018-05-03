package edu.handong.csee.java.lab13.prob02;

public class History extends Book { // History class inherits Book class
	String author; // create String type member author
	
	public History(String name, String author) { // History constructor
		super(name); // apply Book constructor that History class inherits about name
		this.author=author; // author put to this History member author
	}
	
	public void show() { // method that print out History book information
		System.out.println("<<<History>>>"); // print out "<<<History>>>"
		System.out.println("   Id: "+id); // print out "   Id: " and id value
		System.out.println("   Book Name: "+name); // print out "   Book Name: " and name value
		System.out.println("   Author: "+author); // print out "   Author: " and author value
	}
}
