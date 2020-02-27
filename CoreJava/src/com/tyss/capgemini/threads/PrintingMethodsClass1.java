package com.tyss.capgemini.threads;
 
public class PrintingMethodsClass1 extends Thread { //inheriting from "Thread" class
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		for(int i = 1; i < 10; i++) {
			System.out.println("Printing Value: "+i);
		}
	}
}
