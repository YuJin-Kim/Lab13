package edu.handong.csee.java.lab13.prob02;

public class History extends Book {
	String author;
	
	public History(String name, String author) {
		super(name);
		this.author=author;
	}
	
	public void show() {
		System.out.println("<<<History>>>");
		System.out.println("   Id: "+id);
		System.out.println("   Book Name: "+name);
		System.out.println("   Author: "+author);
	}
}
