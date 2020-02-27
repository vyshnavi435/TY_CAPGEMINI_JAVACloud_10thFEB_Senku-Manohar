package com.tyss.capgemini.loops;
import java.util.*;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		
		int i = scanner.nextInt() ;

		if(i %2 ==  0)
		{
			while(true) {
				System.out.println("Number is even");
			}

		}else
		{
			System.out.println("Number is odd");

		}
		scanner.close();
	}

}
