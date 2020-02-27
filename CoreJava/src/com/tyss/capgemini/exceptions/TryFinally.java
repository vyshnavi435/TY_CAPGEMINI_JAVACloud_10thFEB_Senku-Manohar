package com.tyss.capgemini.exceptions;

public class TryFinally {
	public static void main(String[] args) {//it is possible to just have only try and finally blocks
		try {//having catch block for unchecked exceptions is not mandatory
			//having catch block for checked exceptions is  mandatory
			System.out.println(10/0);
			try {
				
			}catch(Exception e) {
				try {
					
				}catch(ArithmeticException a) {
					
				}
			
			}
			finally {
			
			}


		}
		finally{// finally inside finally is not possible &try with finally is possible inside
			// finally.
			System.out.println("code inside finally block ");
			finally {
				
			}
//			try {
//				
//			}catch(Exception e) {
//				
//			}finally {
//			}
//			}

		}

	}

}
