package com.tyss.capgemini.inheitance;

public class FunctionalInterfaceLambdaExample {//to write lambda expression we should not implement
	static String string="Lambda Expression Example for FunctionalInterfaceExample";
	
			static FunctionalInterfaceExample functionalInterfaceExample =//here we created reference variable of class type (FunctionalInterfaceExample)
			() -> {
				System.out.println("string");
				System.out.println("Another Line of Impl");
			};//a lambda expression with out i/p arguments
			
			static FunctionalInterfaceExample2 functionalInterfaceExample2 =
					(i,j) -> {
						System.out.println("Another Line of Impl");
						return i+j;
						
					};//a lambda expression with i/p arguments
			
			public static void main(String[] args) {
				
				functionalInterfaceExample.displayMessage();
				functionalInterfaceExample.showMessage();
				FunctionalInterfaceExample.printMessage();
				
			System.out.println(functionalInterfaceExample2.add(5,6));
			FunctionalInterfaceExample2.Messageprint();
			functionalInterfaceExample2.Messagedisplay();
			
			
			}

}
