package com.tyss.capgemini.exceptions;

public class Doubt {
	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
