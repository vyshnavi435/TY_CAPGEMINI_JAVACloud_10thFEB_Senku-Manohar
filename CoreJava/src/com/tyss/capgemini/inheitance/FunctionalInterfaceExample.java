package com.tyss.capgemini.inheitance;
@FunctionalInterface//by using this annotation we can write only one abstract method.(a kind of locking)
public interface FunctionalInterfaceExample {//functional interface will have only one abstract method &it can have 'n' number of static,default methods
	public void showMessage();
	//	public void Message();  if we uncomment this it show error 
	public static void printMessage() {
		System.out.println("public static printMessage() of FunctionalInterfaceExample");
	}

	default void displayMessage() {
		System.out.println("default displayMessage of FunctionalInterfaceExample");
	}


}
