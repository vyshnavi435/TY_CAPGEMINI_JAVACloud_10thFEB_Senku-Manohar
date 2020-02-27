package com.tyss.capgemini.methods;

public class MethodExample1 {
	public static void displayMessage() {//called method
		System.out.println("execution comes to displaymessage method");
		System.out.println("Hello");
		System.out.println("end of displaymessage method");
		//a method can be called inside a method but,a method cannot be created inside a method.
	}
	
	public static void main(String[] args) {
		System.out.println("display method  is called");
		displayMessage();//calling method
		System.out.println("end of main method");
		
	}

}
