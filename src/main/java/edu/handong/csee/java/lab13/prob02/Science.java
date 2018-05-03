package edu.handong.csee.java.lab13.prob02;

public class Science extends Book {
	String publisher;
	
	public Science(String name, String publisher) {
		super(name);
		this.publisher=publisher;
	}
	
	public void show() {
		System.out.println("<<<Science>>>");
		System.out.println("   Id: "+id);
		System.out.println("   Book Name: "+name);
		System.out.println("   Publisher: "+publisher);
	}
}
