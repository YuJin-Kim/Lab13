package edu.handong.csee.java.lab13.prob05;

import java.util.Scanner;

public class Prob05 { // class Prob05

	public static boolean equals(int[][] l1, int[][] l2) { // method that consider that array l1 equals to array l2
		int difValue=0; // create int type member difValue and initialize to 0
		
		if (l1.length != l2.length) // if l1's size is not equals to l2's size
			return false; // return flase
		
		for (int i=0; i<l1.length; i++) // repeat during i smaller than l1's size
			for (int j=0; j<l1[i].length; j++) // repeat during j smaller than l1[i]'s size
				if (l1[i][j] != l2[i][j]) // if l1[i][j]'s value isn't equals to l2[i][j]'s value
					difValue++; // increase one difValue
		
		if (difValue>3) // if difValue larger than 3
			return false; // return false
		
		return true; // return true
	}
	
	public static void print (int [][] l1, int[][] l2) { // method that print out information about array l1 and array l2
		
		for (int i=0; i<l1.length; i++) { // repeat during i smaller than l1's size
			for (int j=0; j<l1[i].length; j++) // repeat during j smaller than l1[i]'s size
				System.out.print(l1[i][j]+" "); // print out l1[i][j]'s value and " "
			System.out.println(); // print out enter
		}
		
		System.out.println(); // print out enter
		
		for (int i=0; i<l2.length; i++) { // repeat during i smaller than l2's size
			for (int j=0; j<l2[i].length; j++) // repeat during j smaller than l2[i]'s size
				System.out.print(l2[i][j]+" "); // print out l2[i][j]'s value and " "
			System.out.println(); // print out enter
		}
		
		System.out.println(); // print out enter
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row1, row2, column1, column2; // create int type member row1, row2, column1 and column2
		int[][] list1, list2; // create array type member list1 and list2
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		System.out.print("Enter row size(maximum 5): "); // print out "Enter row size(maximum 5): "
		row1=keyboard.nextInt(); // put the row1's value
		System.out.print("Enter column size(maximum 5): "); // print out "Enter column size(maximum 5): "
		column1=keyboard.nextInt(); // put the column1's value
		System.out.print("Enter row size(maximum 5): "); // print out "Enter row size(maximum 5): "
		row2=keyboard.nextInt(); // put the row2's value
		System.out.print("Enter column size(maximum 5): "); // print out "Enter column size(maximum 5): "
		column2=keyboard.nextInt(); // put the column2's value
		
		list1 = new int[row1][column1]; // declare the list1 array's size 
		list2 = new int[row2][column2]; // declare the list2 array's size 
		
		System.out.print("Enter list1: "); // print out "Enter list1: "
		
		for (int i=0; i<row1; i++) // repeat during i smaller than row1
			for (int j=0; j<column1; j++) // repeat during j smaller than column1
				list1[i][j]=keyboard.nextInt(); // put the list1[i][j]'s value
		
		System.out.print("Enter list2: "); // print out "Enter list2: "
		
		for (int i=0; i<row2; i++) // repeat during i smaller than row2
			for (int j=0; j<column2; j++) // repeat during j smaller than column2
				list2[i][j]=keyboard.nextInt();	// put the list2[i][j]'s value	
		
		print(list1, list2); // execute the method that print out information about list1 and list2 value
		
		if (equals(list1, list2)) // if list1 is approximately equals to list2
			System.out.println("The two arrays are approximately identical."); // print out "The two arrays are approximately identical."
		else // else
			System.out.println("The two arrays are not identical."); // print out "The two arrays are not identical."
		
	}

}
