package com.capgemini.assetmaagementsystem.factory;

import com.capgemini.assetmaagementsystem.DAO.AdminDAO;
import com.capgemini.assetmaagementsystem.DAO.AdminDAOImpl;
import com.capgemini.assetmaagementsystem.DAO.UserDAO;
import com.capgemini.assetmaagementsystem.DAO.UserDAOImpl;
import com.capgemini.assetmaagementsystem.service.AdminServices;
import com.capgemini.assetmaagementsystem.service.AdminServicesImpl;
import com.capgemini.assetmaagementsystem.service.UserServices;
import com.capgemini.assetmaagementsystem.service.UserServicesImpl;

public class AdminFactory {
	public static AdminDAO getAdminDAO() {
		 return new AdminDAOImpl();
		 
	 } 
	 public static AdminServices getAdminService() {
		 return new AdminServicesImpl();
	 }
}
