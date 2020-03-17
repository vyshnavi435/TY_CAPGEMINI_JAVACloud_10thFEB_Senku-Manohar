package com.tyss.capgemini.exceptions;
import java.io.FileReader;
import java.util.Properties;
public class CheckedException {
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("applications.properties"));//change name to applications we'll get exception
		} catch (Exception e) {
			System.err.println("Exception caught in try");
			e.printStackTrace();//this method gives specific exception information even for general exception.
		}finally {
			System.out.println("code in finally block");
		}
		
	}

}
