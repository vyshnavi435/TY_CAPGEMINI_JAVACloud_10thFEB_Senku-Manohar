package com.tyss.capgemini.exceptions;

public class ExceptionExample {
	public static void main(String[] args) {//try and catch block should always be inside main method
		String string="";
	
		try {
			System.out.println(string.charAt(3));//only first exception will be handled
			int i=10/0;
			   System.out.println(i);
		
	//doubt::how to handle more than one exception at once
	 
		}
//		 catch (StringIndexOutOfBoundsException e) {//if we write general "Exception" for every exception then ,it will print same message for every exception.  
//			
//			 System.err.println("charAt(int index) should not be called on null String");
//			System.out.println(e.getClass());
//			 System.out.println(e.getCause());//doubt
//			System.out.println(e.getMessage());
//			
//			//"catch" is a block but not any method.
//		}	
//		catch (ArithmeticException e) {
//			System.err.println("Should not divide by Zero");
//			System.out.println(e.getClass());
//			System.out.println(e.getCause());
//			System.err.println(e.getMessage());
//		}
		catch (Exception e) {//this general "Exception" catch block should always be the last catch block.
		System.err.println("An Exception");
		
		System.err.println(e.getMessage());
		}
	
	}

}
