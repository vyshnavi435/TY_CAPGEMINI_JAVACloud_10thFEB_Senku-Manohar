package com.tyss.capgemini.loops;

public class Assignment4Hcf {//hcf means highest number which can divide both the numbers
	public static void main(String[] args) {
		int n1=81;
		int n2=153;
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++ ) {
			if(n1%i == 0 && n2%i ==0 ) {
				gcd=i;
			}
		}
		System.out.println("GCD or HCF of "+n1+" and "+n2+" is :"+gcd);
	}

}
