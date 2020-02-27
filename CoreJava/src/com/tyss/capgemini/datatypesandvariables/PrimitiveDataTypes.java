package com.tyss.capgemini.datatypesandvariables;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		byte b1= 12;//declaration & initialization ,b(variable) is name for memory location
		byte b2;
		b2=6;//it can be initialized in this way too
		short s=123;
		int i=1234;
		long l1=2222;
		long l2=1234533333L;//generally in before versions we use to give 123l(or)113L for long type data ..
		//but in latest version it directly take it as long
		float f =12.987F;//if we don't  specify it as  F or f it automatically considers it as double
		double d=12.987;
		char c='A';//character  type data should always be initialized with ' ' 
		boolean istrue=true;//it can be true or false but not 1 or 0
		
		System.out.println(b1);//utilization(means using the declared variables)
		System.out.println(s);
		System.out.println(i);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(istrue);
	}
}
