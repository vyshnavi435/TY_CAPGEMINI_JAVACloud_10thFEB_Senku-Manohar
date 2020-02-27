package com.tyss.capgemini.exceptions;
//each and every class is extending Exception class
public class CustomException extends Exception{
	public CustomException(String message) {
	//	super(message); here the custom msg is displayed along with exception
		System.err.println(message);//here first the custom msg is displayed and later exception is displayed
	}

}
