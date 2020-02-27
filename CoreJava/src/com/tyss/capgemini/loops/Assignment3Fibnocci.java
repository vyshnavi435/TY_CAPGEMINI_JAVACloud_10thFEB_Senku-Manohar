package com.tyss.capgemini.loops;

public class Assignment3Fibnocci {//fibnocci
	static int n1=0;
	static int n2=1;
	public static void fibnocci(int count) {//a method(recursion)
		
		if(count >0) {
			
			int n3=n1+n2;
			
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			fibnocci(count-1);
		}
	}
	public static void main(String[] args) {
//		int n1=0;
//		int n2=1;
//		int n3;
//		int i;
//		int n = 10;
//		System.out.print(n1+" "+n2);
//		for(i=2;i<n;i++) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//			
//			
//			
//		}
		int count=10;
		System.out.print(n1+" "+n2);
		fibnocci(count-2);
		
			
			
		}
	}


