package com.tyss.capgemini.collections;
//HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
//HashMap allows null key also but only once and multiple null values.
//unordered
import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String,  Integer> hashMap = new HashMap<String, Integer>();
		
		System.out.println("size of HashMap " + hashMap.size());
		System.out.println("+++++++++++++++++++++");
		hashMap.put("1st-key", 1);
		hashMap.put("2nd-Key", 2);
		hashMap.put("3rd-key", 3);
		hashMap.put("4rd-key", 4);
		hashMap.put("4rd-key", 5);
		hashMap.put("4rd-key", 6);
		hashMap.put("4rd	", 4);//it takes the last duplicate key
		
		hashMap.put("5th-key", 2);
		
		hashMap.put(null,5);
		hashMap.put(null,4);	//it takes the last null
	
		
		
		
		System.out.println("size of HashMap " + hashMap.size());
		System.out.println("+++++++++++++++++++++");
		
		System.out.println(hashMap);
		System.out.println("+++++++++++++++++++++");
		
		System.out.println("isEmpty() on hashMap: " + hashMap.isEmpty());
		System.out.println("+++++++++++++++++++++");
		
	//	System.out.println("remove() on hashMap: "+ hashMap.remove("4th-Key"));
		System.out.println("+++++++++++++++++++++");
		
		System.out.println("hashMap after remove(): "+hashMap);
		System.out.println("+++++++++++++++++++++");
		
		System.out.println("size of HashMap After remove(): " + hashMap.size());
		System.out.println("+++++++++++++++++++++");
		
		
	}

}
