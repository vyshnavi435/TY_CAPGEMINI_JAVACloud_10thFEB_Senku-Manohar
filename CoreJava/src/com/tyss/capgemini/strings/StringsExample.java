package com.tyss.capgemini.strings;
//String is immutable(once we create a string and initialize it...its value will never change ..until we again assign a new value to it
public class StringsExample {
	public static void main(String[] args) {
		String string1 = "some string";//creating a string using literal
		String string2=new String("some other string");//creating a string using object
		String string3 = "some other string";
		String string4 = "some string";
		String string5 = new String("some other string");
		System.out.println("string1:"+ string1);
		System.out.println(string1.hashCode());
		System.out.println("string2:"+string2);
		System.out.println(string2.hashCode());
		System.out.println("string3:"+string3);
		System.out.println(string3.hashCode());
		System.out.println("string4:"+string4);
		System.out.println(string4.hashCode());
		System.out.println("string5:"+string5);
		System.out.println(string5.hashCode());
		System.out.println("  string1 == string4: "+string1.equals(string4));
		System.out.println("  string2 == string3: "+string2.equals(string3));
		System.out.println("  string2 == string5: "+string2.equals(string5));
	}
}
