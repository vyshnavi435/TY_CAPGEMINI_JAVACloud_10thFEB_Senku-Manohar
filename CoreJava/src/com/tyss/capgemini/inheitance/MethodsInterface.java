package com.tyss.capgemini.inheitance;

public interface MethodsInterface {//in interfaces all methods we create will be abstract & public default
    public void displayMessage();       //abstract method doesn't have any body,but will end with ';'
	public void printMessage(); 
	public static void showMessage() { //	a method which has declaration and definition is called concrete method.

		System.out.println("public static showMessage() of MethodsInterface ");
	}
	
	 default void defaultMethodMessge() {//either static or default can be used but not both.
		System.out.println("defaultMethodMessage() of MethodsInterface");
	}
	
	
}
