package com.tyss.capgemini.loops;

public class WhileLoopExample {
public static void main(String[] args) {
	int i=1;
	while(i<=10) {//code is executed until the condition becomes false
		System.out.println(i*18);
		i++;//if this increment is not given it forms an infinite Loop
	}
	/* forms an infinite loop
	while(true) {
		System.out.println("hello java");
	}*/
	
//System.out.println();  this statement here throws an  code unreachable error bcz it is written after infinite loop	
		
}
}
