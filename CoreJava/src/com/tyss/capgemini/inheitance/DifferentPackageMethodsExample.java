package com.tyss.capgemini.inheitance;

import com.tyss.capgemini.methods.MethodExample2Calculator;
//example of inheritance
public class DifferentPackageMethodsExample  extends MethodExample2Calculator {
	public static void main(String[] args) {
		 DifferentPackageMethodsExample dpme=new  DifferentPackageMethodsExample();
	System.out.println(dpme.toString());
	System.out.println(dpme.hashCode());
	System.out.println("add method of super class: "+add(5,6));//here due to inheritance we access this methods directly with out class name
	System.out.println("add method of super class: "+sub(5,6));
	System.out.println("add method of super class: "+mul(5,6));
	System.out.println("add method of super class: "+div(22,7));
	
	}

}
