package com.tyss.capgemini.threads;

public class PrintingValues {

	public static void main(String[] args) {	
		
	System.out.println("------------Application Started-----------");
	 PrintingMethodsClass1  printingMethodsClass1 = new  PrintingMethodsClass1();
	 try {
		 printingMethodsClass1.join();
	 } catch (InterruptedException e) {
		 e.printStackTrace();	 
	 }
	 printingMethodsClass1.start();

	Thread thread = new Thread(new PrintingMethodsClass2());
	try {
		thread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	thread.start();
	
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		

		System.out.println("------------Application Ended-----------");
	
	

	}

}
