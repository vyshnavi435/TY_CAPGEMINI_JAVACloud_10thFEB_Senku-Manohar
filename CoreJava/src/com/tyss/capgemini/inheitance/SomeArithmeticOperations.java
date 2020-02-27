package com.tyss.capgemini.inheitance;

import com.tyss.capgemini.methods.MethodExample2Calculator;

public class SomeArithmeticOperations extends MethodExample2Calculator {
	
	public SomeArithmeticOperations() {
		super();//only one super can be inside a constructor and it should be the first statement
		//super("A");
		System.out.println("somearithmeticOperations Constructor..");
	}
	public static void main(String[] args) {
		SomeArithmeticOperations sao=new SomeArithmeticOperations();
		System.out.println("add method of superclass: "+add(45,87));
		System.out.println("sub method of superclass: "+sub(40,50));
		System.out.println("mul method of superclass: "+div(45,9));
		System.out.println("div method of superclass: "+mul(34,56));
	}

}
