package com.tyss.capgemini.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
	public static void main(String[] args) {
		
		try {
			Properties properties = new Properties();
			properties.load(new FileReader("application.properties"));
	        System.out.println(properties.getProperty("name"));
//	        properties.setProperty("batch","javacloud");
//	        System.out.println(properties.getProperty("batch"));
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}

}
