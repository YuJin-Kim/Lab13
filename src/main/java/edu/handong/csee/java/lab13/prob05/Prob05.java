package edu.handong.csee.java.lab13.prob05;

import java.util.Scanner;

public class Prob05 {

	public static boolean equals(int[][] l1, int[][] l2) {
		int difValue=0;
		
		if (l1.length != l2.length)
			return false;
		
		for (int i=0; i<l1.length; i++)
			for (int j=0; j<l1[i].length; j++)
				if (l1[i][j] != l2[i][j])
					difValue++;
		
		if (difValue>3)
			return false;
		
		return true;
	}
	
	public static void print (int [][] l1, int[][] l2) {
		
		for (int i=0; i<l1.length; i++) {
			for (int j=0; j<l1[i].length; j++)
				System.out.print(l1[i][j]+" ");
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<l2.length; i++) {
			for (int j=0; j<l2[i].length; j++)
				System.out.print(l2[i][j]+" ");
			System.out.println();
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row1, row2, column1, column2;
		int[][] list1, list2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter row size(maximum 5): ");
		row1=keyboard.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		column1=keyboard.nextInt();
		System.out.print("Enter row size(maximum 5): ");
		row2=keyboard.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		column2=keyboard.nextInt();
		
		list1 = new int[row1][column1];
		list2 = new int[row2][column2];
		
		System.out.print("Enter list1: ");
		
		for (int i=0; i<row1; i++)
			for (int j=0; j<column1; j++)
				list1[i][j]=keyboard.nextInt();
		
		System.out.print("Enter list2: ");
		
		for (int i=0; i<row2; i++)
			for (int j=0; j<column2; j++)
				list2[i][j]=keyboard.nextInt();		
		
		print(list1, list2);
		
		if (equals(list1, list2))
			System.out.println("The two arrays are approximately identical.");
		else
			System.out.println("The two arrays are not identical.");
		
	}

}
