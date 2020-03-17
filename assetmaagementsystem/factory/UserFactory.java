package com.capgemini.assetmaagementsystem.factory;

import com.capgemini.assetmaagementsystem.DAO.UserDAO;
import com.capgemini.assetmaagementsystem.DAO.UserDAOImpl;
import com.capgemini.assetmaagementsystem.service.UserServices;
import com.capgemini.assetmaagementsystem.service.UserServicesImpl;

public class UserFactory {
 public static UserDAO getUserDAO() {
	 return new UserDAOImpl();
	 
 } 
 public static UserServices getUserService() {
	 return new UserServicesImpl();
 }
}
