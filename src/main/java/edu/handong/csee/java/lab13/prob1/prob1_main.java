package edu.handong.csee.java.lab13.prob1;

public class prob1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend friend1 = new Friend();							// instantiate object 'Friend' to 'friend1'
		SchoolFriend friend2 = new SchoolFriend();				// instantiate object 'SchoolFriend' to 'friend2'
		ClassFriend friend3 = new ClassFriend();				// instantiate object 'ClassFriend' to 'friend3'
		
		InstanceOf.whatFriend(friend1);							// call method whatFriend, with parameter 'friend1'
		InstanceOf.whatFriend(friend2);							// call method whatFriend, with parameter 'friend2'
		InstanceOf.whatFriend(friend3);							// call method whatFriend, with parameter 'friend3'
		
	}

}
