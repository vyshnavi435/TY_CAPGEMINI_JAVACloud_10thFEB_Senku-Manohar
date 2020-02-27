package com.tyss.capgemini.polymorphism;

public class MethodOverridingClass2 implements MethodsInterface {

	@Override
	public String displayMessage() {
		return "overriden displayMessage() of MethodsInterface from MethodOverridingClass2";
	}

	@Override
	public String printMessage() {
		return "overriden printMessage() of MethodsInterface from MethodOverridingClass2";
	}

}
