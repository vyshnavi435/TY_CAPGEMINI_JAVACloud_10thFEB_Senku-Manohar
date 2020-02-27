
package com.tyss.capgemini.strings;

public class StringMethodsExample {
	public static void main(String[] args) {
		String string1 = "Some String";// spaces are also considered
		String string2 = "";
		String string3 = "some STring";
		System.out.println("length of string1: " + string1.length());//length will start counting from 1.
		System.out.println("length of string1: " + string2.length());
		System.out.println("isEmpty() of string: " + string1.isEmpty());//isEmpty() gives boolean output
		System.out.println("isEmpty() of string: " + string2.isEmpty());
		System.out.println(string1.charAt(3));// gives the character which is in the given index
		// System.out.println(string2.charAt(3));throws an exception
		System.out.println(string1.charAt(string1.length() - 1));// prints the last word of string
		System.out.println("equals() of string: " + string1.equals(string3));
		System.out.println("eqaualsIgnoreCase() of String: " + string1.equalsIgnoreCase(string3));// ignores case
																									// sensitivity but
																									// just compare
																									// alphabets.
		string1.concat("concatenated string");// here though we concat ,but we didnt assign it to any variable ..so it
												// is no concatenated.
		System.out.println(string1);// not concatenated

		String string4 = string1.concat("concatenated string");// here we are assigning it ,so it will print
																// concatenated string
		System.out.println(string4);// concatenated

		String string5 = string1.replace('S', 's');// replaces old aphabet with new one
		System.out.println(string1);
		System.out.println("replace() output: " + string5);
		String string6=String.valueOf(1234);//converts data into string
		System.out.println(string6);
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());
		System.out.println("substring(int stindx) of string: "+string1.substring(5));//it will print the elements from index5
		System.out.println("substring(int stindx,int endindx) of string: "+string1.substring(5,9));//it will print the elements from index5 to index8
	    System.out.println("startsWith(String prefix) of String: "+string1.startsWith("A"));
	    System.out.println("endsWith(String prefix) of String: "+string1.startsWith("l"));
	    
	    System.out.println(string1);//string is immutable (even after performing these many operations the string value doesn't change)
	}

}
