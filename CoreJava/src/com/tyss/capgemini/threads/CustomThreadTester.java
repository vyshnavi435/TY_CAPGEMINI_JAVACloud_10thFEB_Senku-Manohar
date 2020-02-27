package com.tyss.capgemini.threads;

public class CustomThreadTester {//inter thread communication happens with wait() and notify() to prevent Deadlock
	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		
	
		new CustomThread1(object1, object2).start();
		new CustomThread2(object1, object2).start();
		
		
	}

}
