package com.tyss.capgemini.operators;

public class TernaryOperator {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		//if true first expression is printed else second expression is printed
		
		int result = (i>j) ? (i+j):(i-j);
		System.out.println(result);//here i>j is false so i-j is printed
		
		int result1 = (i<j) ? (i+j):(i-j);
		System.out.println(result1);//here i<j is True so i+j is printed
		
		//(or)
		System.out.println((i>j) ? (i+j):(i-j));
		
	}

}
