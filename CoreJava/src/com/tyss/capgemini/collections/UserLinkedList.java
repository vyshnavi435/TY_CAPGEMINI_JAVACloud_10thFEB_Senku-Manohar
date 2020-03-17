package com.tyss.capgemini.collections;

import java.util.LinkedList;

import com.tyss.capgemini.encapsulation.User;

public class UserLinkedList {
	public static void main(String[] args) {
		
		LinkedList<User> userLinkedList = new LinkedList<User>();
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		
		user1.setUserid(2020001);
		user1.setUsername("Manohar");
		user1.setPassword("Manohar123");
		
		user2.setUserid(2020002);
		user2.setUsername("username");
		user2.setPassword("password");
		
		user3.setUserid(2020003);
		user3.setUsername("username");
		user3.setPassword("password");
		
		
		user4.setUserid(2020004);
		user4.setUsername("username");
		user4.setPassword("password");
		
		//User Insertion
		userLinkedList.add(user1);
		userLinkedList.add(user1);
		
		userLinkedList.addFirst(user4);
		userLinkedList.addLast(user3);
		
		//Retrieval of User
		for(User user : userLinkedList ) {
			System.out.println(user);
		}
		System.out.println("********************");

		
		//Retrieval of user using peak
		System.out.println(userLinkedList.peek());
		
		//Retrieval and removal of user
		System.out.println(userLinkedList.poll());
		
		//Retrieval of users after poll()
		for (User user : userLinkedList) {
			System.out.println(user);
		}
		System.out.println("********************");
		
		
	}

}
