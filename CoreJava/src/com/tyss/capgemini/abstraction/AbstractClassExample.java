package com.tyss.capgemini.abstraction;

import com.tyss.capgemini.polymorphism.MethodsInterface;

public abstract class AbstractClassExample implements MethodsInterface{//a class can be made abstract even without an abstract method in it.
// A method implementing an abstract class should give implementation for methods in  abstract class (or)
	//if we dont want to give implementation then we can make the class as abstract
	abstract String display();
    abstract String print();
    public String printMessage() {
    	return "printMessage() of MethodsInterface";
    }
}
