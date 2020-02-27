package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {// by putting scanner class object in try catch block ..we dont
														// need to close every scanner class
			int i = 10;
			int j = scanner.nextInt();
			// System.out.println(i/j);
			if (j == 0)
				System.err.println("should not divide number by zero...");
			else
				System.out.println(i / j);
		}
//		 catch (Exception e) {
//			System.err.println("Should not divide the number by zero...");
//			System.err.println(e.getMessage());//displays what mistake we have done
//		}
		// this explanation is only if Scanner class is written inside a try block
		//here Scanner class implements Closable interface and
		//that Closable interface extends Auto closable interface which there is  only one  close( ) method and 
		//that is the reason it will  automatically closes the resource inside try block
	}

}
