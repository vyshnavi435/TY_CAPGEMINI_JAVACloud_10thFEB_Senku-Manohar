package com.tyss.capgemini.methods;

public class MethodOverloadingExample {// method overloading can be done with static & non-static too
	public static void displayMessage() {
		System.out.println("public static void displayMessage()");

	}

	public static void displayMessage(String name) {
		System.out.println("public static void displayMessage(String name)");

	}

	public void displayMessage(String name, int i) {
		System.out.println("public  void displayMessage(String name,int i)");

	}

	public void displayMessage(int i, String name) {
		System.out.println("public  void displayMessage(int i,String name)");

	}

	public static void main(String[] args) {
		displayMessage();// static method (or)
		MethodOverloadingExample.displayMessage();// same method but calling with class name
		displayMessage("hi");
		MethodOverloadingExample mve = new MethodOverloadingExample();
		mve.displayMessage(5, "hi");// non-static method definitely need object reference
		mve.displayMessage("hi", 5);// non-static method definitely need object reference

	}

}
