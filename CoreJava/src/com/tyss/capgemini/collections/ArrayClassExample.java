package com.tyss.capgemini.collections;
//all methods present inside "Arrays" class are static
import java.util.Arrays;

public class ArrayClassExample {
	public static void main(String[] args) {


		int[] intArray = {34, 45, 46, 55, 90,7,2,56,54,8};
		Arrays.sort(intArray);

		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("________________________________");//copying one array to another
		int[] intArray2 = Arrays.copyOf(intArray, 10);
		System.out.println("length of array" + intArray2.length);
		for(int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		System.out.println("==================================");
	//	Arrays.fill(intArray2, 7,10,190);//places 190 btw those indexes
		//Arrays.fill(intArray2, 9,10,190);
		for(int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		System.out.println("_____________________________");
		System.out.println(intArray.equals(intArray2));
        System.out.println(Arrays.equals(intArray, intArray2));// it is a method in Arrays class & it checks whether same numbers are there or not but,it is not bothered about indexes
	}
}



