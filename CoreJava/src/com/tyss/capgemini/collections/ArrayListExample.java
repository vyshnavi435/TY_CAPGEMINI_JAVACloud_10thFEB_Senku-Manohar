package com.tyss.capgemini.collections;
//size() is used for lists

//ArrayList is dynamic
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		
		arrayList.add(12);
		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(21);
		arrayList.add(40);
		arrayList.add(67);
		arrayList.add(3);
		arrayList.add(97);
		arrayList.add(23);
		arrayList.add(90);
		arrayList.add(null);
		
		
	//	arrayList.add(12, 14);//it shows an error
		//different ways to print array elements
		
		System.out.println("size of ArrayList: " + arrayList.size());
		System.out.println("________________________________________");
	//	Collections.sort(arrayList);
		for (Integer integer : arrayList) {//for-each loop
			System.out.println(integer + " ");
		}
		System.out.println("________________________________________");

		 System.out.println(arrayList);//using print()
			System.out.println("________________________________________");

	    for (int i = 0; i < arrayList.size(); i++) {//for loop
	    	System.out.println(arrayList.get(i));
	    }
		System.out.println("________________________________________");
	    arrayList.remove(4);//to remove an element from array in specific index
	    System.out.println("size of ArrayList after remove: " + arrayList.size());
	    System.out.println("----------------------------------");
	    Collections.rotate(arrayList, -(arrayList.size() - 1));
	    System.out.println(arrayList);
	    System.out.println("----------------------------------");

	    for (int i = 0; i < arrayList.size(); i++) {//for loop
	    	System.out.println(arrayList.get(i));
	    }
	    boolean isThere1 = arrayList.contains(23);
	    boolean isThere2 = arrayList.contains("qwerty");
	    boolean isThere3 = arrayList.contains(null);
	    
	    
	  System.out.println( "is the number 23 present in arrayList: "+ isThere1);//checks in array list whether that number is present & gives boolean output
	  System.out.println( "is the number 23 present in arrayList: "+ isThere2);
	  System.out.println( "is the number 23 present in arrayList: "+ isThere3);
	}
}
