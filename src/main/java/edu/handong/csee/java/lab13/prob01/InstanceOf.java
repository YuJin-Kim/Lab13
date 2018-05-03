package edu.handong.csee.java.lab13.prob01;

public class InstanceOf {

	public static void whatFriend(Friend friend) {
		
		if (friend instanceof ClassFriend)
			((ClassFriend) friend).classFriendPrint();
		else if (friend instanceof Friend)
			friend.friendPrint();
		else if (friend instanceof SchoolFriend)
			((SchoolFriend) friend).schoolFriendPrint();
	
	}
}
