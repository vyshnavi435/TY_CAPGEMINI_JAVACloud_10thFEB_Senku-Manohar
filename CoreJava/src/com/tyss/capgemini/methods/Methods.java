package com.tyss.capgemini.methods;

public class Methods {
	public static String displayMessage() {//static methods cannot be over ridden bcz they are loaded only once when class is loaded
		return "static Methods.displayMessage()";
		
		
	}
	public String printMessage() {
		return "non-static Methods.printMessage()";
		
	}
	int addingTwoIntegers(int i,int j) {
		return i+j;
		
	}
	
	protected String welcomeMessage() {
		return "Hello World";
		
	}
	private String messageDisplay() {//private scope only with in class
		return "private messageDisplay()";
		
	}

}
