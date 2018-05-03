package edu.handong.csee.java.lab13.prob01;

public class Prob01 { // Class Prob01
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend friend1 = new Friend(); // create Friend type object firend1
		SchoolFriend friend2 = new SchoolFriend(); // create School Friend type object firend2
		ClassFriend friend3 = new ClassFriend(); // create Class Friend type object firend3
		
		InstanceOf.whatFriend(friend1); // execute the method that consider friend1's type
		InstanceOf.whatFriend(friend2); // execute the method that consider friend2's type
		InstanceOf.whatFriend(friend3); // execute the method that consider friend3's type
	}

}
