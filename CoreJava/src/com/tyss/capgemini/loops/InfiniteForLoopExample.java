package com.tyss.capgemini.loops;

public class InfiniteForLoopExample {
	public static void main(String[] args) {
		
		int i=10;
		for( ; ;) {//forms infinite loop //if no arguments (or) no condition (or) if condition  is given true it forms an infinite loop  for(int j=1;true;j++)
			System.out.println(i);
			
		}//we can not have any line of code after an infinite loop bcz it shows code unreachable error
		//System.out.println("hii");
		
	}
	

}
