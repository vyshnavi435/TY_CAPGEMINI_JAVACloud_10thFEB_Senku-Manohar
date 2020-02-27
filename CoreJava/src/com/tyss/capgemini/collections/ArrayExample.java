package com.tyss.capgemini.collections;
//array is a collection of similar type of data
public class ArrayExample {
	public static void main(String[] args) {
		int[] intArray1 = new int[6];
//		int intArray2[] = new int[6]; Not the proper way of creating array.
//creating and initializing an array
		int[]  intArray2 = {10,20,30,40,50,60};
	
		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		intArray1[5] = 'A';//it prints ASCII value of A & we can't give a string bcz it doesn't have any ASCII value
	  //intArray1[5] = Integer.parseInt("&"); //throws number format exception
	  //intArrat1[5] = Integer.parseInt("12334567");//this prints the number
	  //intArrat1[5] = Integer.parseInt("Qwerty");//throws number format exception
	//for loop
		for (int i = 0; i < intArray1.length;i++) {// if we write conditions as i<= then it will show arrayindexoutofbound
			System.out.println("Element at index: "+ i + " = " + intArray1[i]);
		}// length keyword counts array size from "1"
		
//for-each loop
		for (int i : intArray2) {//i = variable & intArray2 = array
			System.out.println("Element at index: "+i);
		}
		
		
	}
	

}
