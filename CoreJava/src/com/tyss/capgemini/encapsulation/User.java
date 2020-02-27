package com.tyss.capgemini.encapsulation;
// so what ever we write we specify its access modifier as private
public class User {
	private String username;
	private String password;
	private Integer userid;
	
	//constructors are used to set values
	public User(String username, String password, Integer userid) {
		super();
		this.username = username;
		this.password = password;
		this.userid = userid;
	}
	public User() {
		
	}
	
	
	//generate getters & setters using alt+shift+s
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {//we can or cannot have getPassword
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	@Override//if we dont write this we will just get the address
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + "]";
	}
	
	
	

}
