package com.capgemini.assetmaagementsystem.service;

public interface AdminServices {
	public  boolean getAllUsers();
	public boolean insertUsers(int id,String title,String category,int quantity,double price,double total_price,String details);
	public boolean delete(Integer id);
	public boolean checkAdmin(String adminname,String password);
	public boolean checkUser();
	public boolean AdminUser(String adminname, String password);
}
