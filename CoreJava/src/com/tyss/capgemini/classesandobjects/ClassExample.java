package com.tyss.capgemini.classesandobjects;

public class ClassExample {//a single class can have 'n' number of constructors but with difference in signature.
	public ClassExample(/*no arguments*/) {//this is a zero-argument constructor
		
		System.out.println("zero-argument constructor");
		//constructor doesn't have return type
	}//if we comment this constructor then the 'ce1' object will show error( bcz no default constructor) 

    public ClassExample(String name) {//this is called parameterized constructor bcz it has atleast one parameter
		
		System.out.println("this constructor has one argument ");
		//constructor doesn't have return type
	}
    //if a class has multiple  constructors  with same name but with difference in parameters is called constructor overloading

    public ClassExample(String name,int i) {//constructor overloading
		
		System.out.println("this constructor has one string and one int ");
		
	}
     public ClassExample(int i,String name) {//constructor overloading
		
		System.out.println("this constructor has one int and one string ");
		
	}
public static void main(String[] args) {
	  ClassExample ce1=new ClassExample();//each and every concrete class will have a constructor "ClassExample" here is a constructor 
	                                      //and here we use "new" keyword to invoke a constructor
	  //if we dont have any constructor then it will create a default constructor,but if there alteast one constructor it doesn't create any default constructor
	  ClassExample ce2=new ClassExample("Any String");
	  ClassExample ce3=new ClassExample("Any String",5);
	  ClassExample ce4=new ClassExample(5,"Any String");


}
}
