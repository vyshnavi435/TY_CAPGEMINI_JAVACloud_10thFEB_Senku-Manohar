package com.tyss.capgemini.collections;

import java.util.HashMap;

import com.tyss.capgemini.encapsulation.User;

public class UserHashMap {
	public static void main(String[] args) {
		HashMap<String,  User> userHashMap = new HashMap<String, User>();
	
		//
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
		
		user4.setUserid(202000);
		user4.setUsername("username");
		user4.setPassword("password");
		
		userHashMap.put("1st-user", user1);
		userHashMap.put("2st-user", user2);
		userHashMap.put("3st-user", user3);
		userHashMap.put("4st-user", user4);
		
		// Retrieval of Users
		System.out.println("userHashMap after data insertion");
		System.out.println(userHashMap);
		System.out.println("****************************");
		
		//update of user data
		
		user4.setPassword("qwerty@12345");
		userHashMap.put("4th-User", user4);
		
		//retrieval of users after update
		System.out.println("update of user data");
		System.out.println(userHashMap);
		System.out.println("****************************");

		
		
		//deletion of user
		userHashMap.remove("3rd-user");
		
		//retrieval of users after deletion
		System.out.println("deletion of use");
		System.out.println(userHashMap);
		System.out.println("******************************");
	}

}
