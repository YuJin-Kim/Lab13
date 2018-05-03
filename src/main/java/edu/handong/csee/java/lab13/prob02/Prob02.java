package edu.handong.csee.java.lab13.prob02;

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("Simple Book");
		Science book2 = new Science("Hello Physics!", "ScienceWorld");
		History book3 = new History("What Is history?", "E.H.Carr");
		History book4 = new History("The South Korea", "Judis");
		
		book1.show();
		book2.show();
		book3.show();
		book4.show();
		
	}

}
