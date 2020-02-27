package com.tyss.capgemini.operators;

public class UnaryOperator {//these operators can also work with single opertor
	public static void main(String[] args) {
		int i=10;
		int j=10;
		boolean isTrue=true;
		System.out.println(-i);//to convert positive number to negative number
		System.out.println(!isTrue);//using this !  we can print false for this value
		//increment
		System.out.println("i with pre-increment: "+ ++i);//increment and utilize(pre-increment)
		System.out.println("value of i: "+i);
		System.out.println("j with post-increment: "+ j++);//utilize and increment(post-increment)
		System.out.println("value of j: "+j);
		
		//decrement
		System.out.println("i with decrement: "+ --i);//decrement and utilize(pre-decrement)
		System.out.println("value of i: " +i);
		System.out.println("j with post-increment: "+ j--);//utilize and decrement(post-decrement)
		System.out.println("value of j: "+j);
	}

}
