package com.tyss.capgemini.methods;

public class MethodCallingClass {
	public static void main(String[] args) {
		AreaCalculator ac=new AreaCalculator();
		System.out.println( "area of circle: "+ac.circleArea(4));
		System.out.println("area of square: "+ac.squareArea(5));
		System.out.println("area of rectangle: "+ac.rectArea(4, 5));
	}

}
