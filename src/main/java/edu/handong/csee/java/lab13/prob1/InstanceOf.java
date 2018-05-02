package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	public static void whatFriend(Friend friend) {
		if(friend instanceof ClassFriend)					// if friend is instance of ClassFriend
			((ClassFriend)friend).classFriend();			// call method 'classFriend'
		else if(friend instanceof SchoolFriend)				// if friend is instance of ClassFriend
			((SchoolFriend)friend).schoolFriend();			// call method 'schoolFriend'
		else
			friend.justFriend();							// else, call method 'justFriend'
	}
}
