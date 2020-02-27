package com.tyss.capgemini.inheitance;

public class MethodsInterfaceJ8Impl implements MethodsInterface {//in interface we cannot create object so,we created a class and implemented it to call those methods
	
	@Override
	public void displayMessage() {
		System.out.println("Overriden displayMessage() of MethodsInterface");
	}
	@Override
	public void printMessage() {
		System.out.println("Overriden printMessage() of MethodsInterface");

	}
	public static void main(String[] args) {
		MethodsInterfaceJ8Impl methodsInterfaceJ8Impl= new MethodsInterfaceJ8Impl();
		
		methodsInterfaceJ8Impl.displayMessage();
		methodsInterfaceJ8Impl.printMessage();
		methodsInterfaceJ8Impl.defaultMethodMessge();
		MethodsInterface.showMessage();
	}
}
