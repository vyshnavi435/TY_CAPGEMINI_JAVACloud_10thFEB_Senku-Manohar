package com.tyss.capgemini.classesandobjects;

public class ObjectClassMethodExample {
	public static void main(String[] args) {
		ObjectClassMethodExample ocme1 = new ObjectClassMethodExample();
		ObjectClassMethodExample ocme2 = new ObjectClassMethodExample();
		
		
		System.out.println(ocme1.getClass());// 'getClass()'  method gives fully qualified path name of the class(we get class representation of an object)
	    System.out.println(ocme1);//give hexadec address of the object along with fully qualified path name of the class
	    System.out.println(ocme1.hashCode());//converts the hexadec object address to numeric value. 
	    System.out.println("with toString()"+ocme1.toString());//this is same as directly printing objects
	   
	    System.out.println(ocme1.getClass());// 'getClass()'  method gives fully qualified path name of the class(we get class representation of an object)
	    System.out.println(ocme2);//give hexadec address of the object along with fully qualified path name of the class
	   //here this is different object so hexadec value is also diff
	    System.out.println(ocme2.hashCode());//converts the hexadec object address to numeric value. 
	    System.out.println("with toString()"+ocme2.toString());//this is same as directly printing objects
	    System.out.println(ocme1.equals(ocme2));
	}

}
