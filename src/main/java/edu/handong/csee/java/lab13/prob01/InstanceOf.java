package edu.handong.csee.java.lab13.prob01;

public class InstanceOf { // class InstanceOf

	public static void whatFriend(Friend friend) { // method that consider friend type
		
		if (friend instanceof ClassFriend) // if friend is ClassFriend type
			((ClassFriend) friend).classFriendPrint(); // print out "Class Friend"
		else if (friend instanceof Friend) // if friend is Friend type
			friend.friendPrint(); // print out "Just Friend!"
		else if (friend instanceof SchoolFriend) // if friend is SchoolFriend type
			((SchoolFriend) friend).schoolFriendPrint(); // print out "School Friend!"
	
	}
}
