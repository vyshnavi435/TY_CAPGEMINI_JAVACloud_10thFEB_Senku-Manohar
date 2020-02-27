package com.tyss.capgemini.exceptions;

public class InvalidNumberCustomException extends RuntimeException{//most of the times we should be inheriting from RuntimeException
	//bcz by using this we dont need to declare throws at main method
	public InvalidNumberCustomException(String message) {
			super(message); //here the custom msg is displayed along with exception
		//System.err.println(message);//here first the custom msg is displayed and later exception is displayed
	}

}
