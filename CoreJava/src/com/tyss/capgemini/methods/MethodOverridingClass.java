package com.tyss.capgemini.methods;

public class MethodOverridingClass extends Methods {
	@Override
	public String printMessage() {
		
		return "non-static MethodOverridingClass.printMessage()";
	}
	//static methods cannot be overridden so we removed @Override  here
	public static String displayMessage() {
		return "static methodOverridingClass.displayMessage()";
	}@Override
	protected String welcomeMessage() {
		
		return super.welcomeMessage();
	}
	@Override
	int addingTwoIntegers(int i, int j) {
		
		return super.addingTwoIntegers(i, j);
	}
	public static void main(String[] args) {
		 MethodOverridingClass  methodOverridingClass=new MethodOverridingClass();
		System.out.println(methodOverridingClass.printMessage());
		 System.out.println(methodOverridingClass.welcomeMessage());
		 System.out.println(methodOverridingClass.addingTwoIntegers(5, 6));
		 //new MethodOverridingClass().printMessage());//directly using object with out reference bcz we are using it only once
		System.out.println(Methods.displayMessage());
		System.out.println(displayMessage());
	}
	

}
