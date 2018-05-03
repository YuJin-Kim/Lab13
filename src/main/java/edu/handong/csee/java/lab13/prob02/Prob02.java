package edu.handong.csee.java.lab13.prob02;

public class Prob02 { // class Prob2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("Simple Book"); // create Book type object book1 and initialize the name value to "Simple Book"
		Science book2 = new Science("Hello Physics!", "ScienceWorld"); // create Science type object book2 and initialize the name value to "Hello Physics!", the publisher value to "ScienceWorld"
		History book3 = new History("What Is history?", "E.H.Carr"); // create History type object book3 and initialize the name value to "What Is history?", the author value to "E.H.Carr"
		History book4 = new History("The South Korea", "Judis"); // create History type object book4 and initialize the name value to "The South Korea", the author value to "Judis"
		
		book1.show(); // execute the method that print out information about book1
		book2.show(); // execute the method that print out information about book2
		book3.show(); // execute the method that print out information about book3
		book4.show(); // execute the method that print out information about book4
		
	}

}
