package com.capgemini.assetmaagementsystem.service;

public interface UserServices {
	public  boolean getAllUsers();
	public boolean insertUsers(String title1,String category,int quantity,int price);
	public boolean delete(Integer id);
}
