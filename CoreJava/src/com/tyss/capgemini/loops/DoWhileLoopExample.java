package com.tyss.capgemini.loops;

public class DoWhileLoopExample {
	public static void main(String[] args) {
		int i=1;
		do {//do while first prints the statement once and later it checks for condition
			System.out.println("Value of i in do : "+i );
			i++;
		} while(i <= 10);
		/*
		do {// here though condition is false it prints the statement once
			System.out.println("Value of i in do : "+i );
			i++;
		} while(i < 0); */
		
	}

}
