package edu.handong.csee.java.lab13.prob04;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String catName, dogName;
		Master master = new Master();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the cat name and dog name: ");
		catName=keyboard.next();
		dogName=keyboard.next();
		
		Cat cat = new Cat(catName);
		Dog dog = new Dog(dogName);
		
		cat.getName();
		master.feed(cat);
		dog.getName();
		master.feed(dog);
	}
}
