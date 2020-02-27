package com.tyss.capgemini.exceptions;
import java.util.*;
public class CustomExceptionTester2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();
		scanner.close();
		try {
			int i = 10/number;//if number=0 it while throw an exception
			System.out.println(i);
		}catch (Exception e) {
			throw new InvalidNumberCustomException("Any Message");

		}
	}

}
