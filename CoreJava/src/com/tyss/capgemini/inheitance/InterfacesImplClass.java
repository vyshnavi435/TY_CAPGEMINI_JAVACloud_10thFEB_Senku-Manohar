package com.tyss.capgemini.inheitance;

public class InterfacesImplClass implements MethodsInterface,AnotherInterface{
	//implements(same as extends) is used for inheritance in interface 
	//we Cannot create object for an interface
	@Override
	public void displayMessage() {
		System.out.println("over ridden display() of MethodsInterface");
		
	}
	@Override
	public void printMessage() {
		System.out.println("over ridden printMessage() of MethodsInterface");
	}
	
	@Override
	public void messageDisplay() {
		System.out.println("overridden messageDisplay() of AnotherMethodsInterface");
	}
	public static void main(String[] args) {
		MethodsInterface methodsInterface =new InterfacesImplClass();
		AnotherInterface anotherMethodsInterface =new InterfacesImplClass();
		methodsInterface.printMessage();
		methodsInterface.displayMessage();
		anotherMethodsInterface.messageDisplay();
		
//		InterfacesImplClass implClass=new InterfacesImplClass();
//		implClass.displayMessage();
//		implClass.printMessage();
//		implClass.messageDisplay();
		
		
	}
	

}



