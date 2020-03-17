package com.tyss.capgemini.exceptions;
import java.util.*;
public class CustomExceptionTester1 {
	public static void main(String[] args) throws InvalidNumberCustomException, CustomException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number..");
		int number = scanner.nextInt();
		scanner.close();
		if(number >= 0 && number <= 10) {
			System.out.println(number*10);
		} else 
			throw new CustomException("customException Message"); //throwing a custom exception using "throw" keyword by creating an object
			throw new InvalidNumberCustomException("the number should be greater than 10 ");//which ever the throw statement is written first that exception will be thrown and second throw statement cannot be accessed 
		
		
	}

}
