package com.tyss.capgemini.inheitance;

public class FunctionalInterfaceImpl implements FunctionalInterfaceExample,FunctionalInterfaceExample2{

	@Override
	public void showMessage() {
		System.out.println("overriden showMessage() of FunctionalInterfaceExample");
		
	}
	@Override
	public int add(int i, int j) {
		
		return i+j;
	}
	public static void main(String[] args) {
		FunctionalInterfaceImpl functionalInterfaceImpl =new FunctionalInterfaceImpl();
		functionalInterfaceImpl.displayMessage();
		functionalInterfaceImpl.showMessage();
		FunctionalInterfaceExample.printMessage();
		System.out.println("add() of FunctionalInterfaceExample2:"+functionalInterfaceImpl.add(4, 5));	
		functionalInterfaceImpl.Messagedisplay();
		FunctionalInterfaceExample2.Messageprint();
		
	}

}
