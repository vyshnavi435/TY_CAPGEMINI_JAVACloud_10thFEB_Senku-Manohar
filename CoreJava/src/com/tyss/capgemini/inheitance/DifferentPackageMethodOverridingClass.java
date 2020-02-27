package com.tyss.capgemini.inheitance;
import com.tyss.capgemini.methods.*;
public class DifferentPackageMethodOverridingClass extends Methods {
	@Override
	public String printMessage() {
		
		return "Overridden DifferentPackageMethodOverriding.printMessage()";
	}
	@Override
	protected String welcomeMessage() {
		
		return "hello world from DifferentPackageMethodOverridingClass";
	}
	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass differentPackageMethodOverridingClass=
				new DifferentPackageMethodOverridingClass();
		System.out.println(differentPackageMethodOverridingClass.printMessage());
		System.out.println(differentPackageMethodOverridingClass.welcomeMessage());
	}

}
