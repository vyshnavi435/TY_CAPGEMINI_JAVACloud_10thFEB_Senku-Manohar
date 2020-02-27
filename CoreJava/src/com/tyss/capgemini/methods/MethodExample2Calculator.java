package com.tyss.capgemini.methods;

public class MethodExample2Calculator {
	public MethodExample2Calculator( ) {
		System.out.println("basic arith");
	}
	
	public MethodExample2Calculator( String name) {
		System.out.println("basic arith str");
	}
	//to write this /** enter (to give  description about method and it should be written just before the method)
	/**
	 * This method returns the sum of two given integers.
	 * @param i
	 * @param j
	 * @return int i + int j
	 */
	public static int add(int i,int j) {//method signature &static methods can be called with out object creation.
		return i+j;
	//	return i;(method can have only one return statement)	
	}
	/**
	 * This method returns the subtraction of two given integers.
	 * @param i
	 * @param j
	 * @return int i -int j
	 */
	
	public static int sub(int i,int j) {
		return i-j;
	}
	
	/**
	 * This method returns the division of two given integers.
	 * @param i
	 * @param j
	 * @return int i/int j
	 */
	
	public static double div(int i,double j) {
		return (i/j)*1.0;
	}
	/**
	 * This method returns the multiplication  of two given integers.
	 * @param i
	 * @param j
	 * @return int i * int j
	 */
	
	public static int mul(int i,int j) {
		return i*j;
	}
		
	public static void main(String[] args) {
		int sum=add(12,13);
		System.out.println("sum is : "+sum);//(or)
		System.out.println("sum is : "+add(12,14));
		double i=div(10,3);
	int  k=	mul(10,20);
	int j=	sub(2,8);
	System.out.println(i);
	System.out.println(k);
	System.out.println(j);
	}

}
