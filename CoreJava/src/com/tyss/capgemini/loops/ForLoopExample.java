package com.tyss.capgemini.loops;

public class ForLoopExample {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {  
			System.out.println(i*10);
			//if no arguments (or) no condition (or) if condition  is given true it forms an infinite loop  for(int j=1;true;j++)
			//if we want we can  Inc/Dec inside the for loop(i++/i--) 

		}
		System.out.println("-----------for loop2------------------");
		int j=0;
		for(;j<10;j++) {
			System.out.println((j+1) *12);
		}
		System.out.println("-----------for loop3------------------");
		
		int k=0;
		for(;k<10;) {
			System.out.println((k+1)*13);
			k++;
			
		}
			
	}

}
