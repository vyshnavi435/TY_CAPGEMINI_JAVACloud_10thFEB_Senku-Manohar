package com.tyss.capgemini.methods;

public class MethodExample2 {
	
	public void displayMessage() {
		System.out.println("start of displayMessage()");
		System.out.println("hello world");
		System.out.println("end of displayMessage()");
		System.out.println("returning to calling method");
		
	}
	public static void main(String[] args) {
	MethodExample2 m=new MethodExample2();//creating an object to call non static method
	System.out.println("called displayMessage() via object");
		m.displayMessage();
	System.out.println("end of main method");
	}

}
