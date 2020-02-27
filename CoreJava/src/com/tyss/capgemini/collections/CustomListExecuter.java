package com.tyss.capgemini.collections;

public class CustomListExecuter {
	public static void main(String[] args) {
		CustomList customList = new CustomList(4);
		customList.add("1");
		customList.add("4");
		customList.add("1");
		customList.add("12");
		customList.add("1");
		customList.add("2");
		System.out.println("CustomList size: "+customList.size());
		System.out.println("________________________________________");
		for (int i = 0; i < customList.size(); i++) {
			System.out.println("Element at " + i + "index: "+customList.get(i));
		}
		System.out.println("________________________________________");
		boolean isThere = customList.contains("12");
		System.out.println("customList.contains(12): " + isThere );
		System.out.println("________________________________________");
		System.out.println(customList.getIndex("123"));
	}

}
