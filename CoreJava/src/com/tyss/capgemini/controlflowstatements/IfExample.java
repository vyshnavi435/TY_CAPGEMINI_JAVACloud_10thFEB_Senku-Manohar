package com.tyss.capgemini.controlflowstatements;

public class IfExample {
	public static void main(String[] args) {
		int age=17;
		/*	if(age>=18) (here with out braces only one statement is considered inside if block)
			System.out.println("Allowed to vote");
		System.out.println("Allowed to vote");
		System.out.println("code outside the if block"); */
		if(age>=18) {
			System.out.println("Allowed to vote");
		}
		System.out.println("code outside the if block");

	}

}
