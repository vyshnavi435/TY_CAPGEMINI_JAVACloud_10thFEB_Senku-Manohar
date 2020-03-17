package com.tyss.capgemini.collections;
//no duplicate values
// implements hashtable and set
//unordered
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("1st String");
		hashSet.add("2nd String");
		hashSet.add("3rd String");
		hashSet.add("4th String");
		hashSet.add("1st String");
		System.out.println("size of hashSet after add() : " + hashSet.size());
		System.out.println("************************");
		System.out.println(hashSet);
		System.out.println("contains on hashset: " + hashSet.contains("5th String"));
		System.out.println("************************");
		System.out.println("is it empty: " + hashSet.isEmpty());
	}

}
