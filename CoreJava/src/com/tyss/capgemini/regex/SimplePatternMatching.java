package com.tyss.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePatternMatching {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d");//Pattern is present in java util .regex  & we cant create object using new keyword
	 // \\d will match only the single digit (0-9)
		Matcher matcher = pattern.matcher("1");//store the digit pattern we want & if we give more  than 1digit in matcher() we get false bcz its not a pattern match
	    System.out.println(matcher.matches());
	}

}
 
