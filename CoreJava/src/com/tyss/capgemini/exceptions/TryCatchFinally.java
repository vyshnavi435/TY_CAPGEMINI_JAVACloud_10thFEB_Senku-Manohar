package com.tyss.capgemini.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		//where ever we write System.exit(0); it get out of the block
		try {
			
			
			System.out.println(10/0);
			System.exit(0);
			
			
			//but here it doesnt get out of block bcz first exception statement is getting  executed
			
		} catch (Exception e) {
			System.err.println("exception Caught in the code");  
				//	System.exit(0);by writing this"finally"wont get executed 
		} finally {//it gets executed whether the exception is handled or not    
			System.out.println("it gets executed whether there is an exception or not");
		
		}
	System.out.println("some code");
	}

}
