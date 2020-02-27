package com.tyss.capgemini.methods;

public class StaticMethodCallingClass {
	public static void main(String[] args) {
	int sum =	MethodExample2Calculator.add(8, 9);//calling a method which is in another class using class name "MethodExample2Calculator".
		System.out.println("sum is: "+sum);
		System.out.println("sub is: "+MethodExample2Calculator.sub(8, 9));
		System.out.println("mul is: "+MethodExample2Calculator.mul(8, 9));
		System.out.println("div is: "+MethodExample2Calculator.div(9, 8));
	}

}
