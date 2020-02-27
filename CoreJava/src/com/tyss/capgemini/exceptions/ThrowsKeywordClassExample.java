package com.tyss.capgemini.exceptions;
import java.io.*;
import java.util.*; 
public class ThrowsKeywordClassExample {//for checked exception it is mandatory to write "throws" exception
	public static void main(String[] args) throws FileNotFoundException, IOException {// if wanted after throws we can just write Exception(general)
	//	System.out.println(10/0);//unchecked exception
		Properties properties = new Properties();
		// properties.load(new FileReader("applications.properties")); throws exception bcz there is no file with that name
		
		 properties.load(new FileReader("application.properties"));
		 System.out.println(properties.getProperty("name"));
		 System.out.println("some code");
	}

}
