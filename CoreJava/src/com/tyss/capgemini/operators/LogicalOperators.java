package com.tyss.capgemini.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		int k=30;
		//AND(&) Operator
		System.out.println((i>j)&&(j>k));// 0 && 0
		System.out.println((i>j)&&(j<k));// 0 && 1
		System.out.println((i<j)&&(j>k));// 1 && 0
		System.out.println((i<j)&&(j<k));// 1 && 1

		System.out.println("--------------------------");
		
		//OR(||) Operator
		System.out.println((i>j)||(j>k));// 0 || 0
		System.out.println((i>j)||(j<k));// 0 || 1
		System.out.println((i<j)||(j>k));// 1 || 0
		System.out.println((i<j)||(j<k));// 1 || 1
		
		System.out.println("--------------------------");
		
		//NOT(!) Operator
		System.out.println(i!=j);

	}
}
