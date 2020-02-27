package com.tyss.capgemini.encapsulation;

public class UserTesterClass {
	
	private static User setUser(String username, String password, Integer userid ) {
		return new User(username, password, userid);
		//also return new User(user.getUsername(), user.getPassword(), user.getUserid());
	}
	
	
	
	
	public static void main(String[] args) {
	//	User user1 = setUser("Mike", "qwerty", 2020001);
		User user2 = new User();//different way to give values
		user2.setUsername("manu");
		user2.setUserid(2020002);
		user2.setPassword("passpass"); 
		
		
	//	System.out.println(user1);
		
		System.out.println("username: "+user1.getUsername());
		System.out.println("user_id: "+user1.getUserid());
		
		System.out.println(user2);
	}

}
