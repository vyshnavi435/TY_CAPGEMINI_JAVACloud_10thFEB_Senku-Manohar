package com.tyss.capgemini.collections;
//ordered
//no duplicate values
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet= new LinkedHashSet<String> ();
		
		linkedHashSet.add("1st String");
		linkedHashSet.add("2nd String");
		linkedHashSet.add("3rd String");
		linkedHashSet.add("4th String");
		linkedHashSet.add("1st String");
		System.out.println("size of LinkedhashSet after add() : " + linkedHashSet.size());
		System.out.println("************************");
		System.out.println(linkedHashSet);
		System.out.println("contains on Linkedhashset: " + linkedHashSet.contains("5th String"));
		System.out.println("************************");
		System.out.println("is it empty: " + linkedHashSet.isEmpty());
	}

}
