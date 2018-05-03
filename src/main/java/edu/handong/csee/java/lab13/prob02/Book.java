package edu.handong.csee.java.lab13.prob02;

public class Book {
	int id;
	static int idCount=1;
	String name;
	
	public Book(String name) {
		id=idCount++;
		this.name=name;
	}
	
	public void show() {
		System.out.println("<<<BOOK>>>");
		System.out.println("   Id: "+id);
		System.out.println("   Book Name: "+name);
	}
}
