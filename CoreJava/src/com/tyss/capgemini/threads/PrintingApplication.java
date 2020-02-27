package com.tyss.capgemini.threads;

public class PrintingApplication {
	synchronized public void printingDocuments(String documents, int numOfCopies) {
		for(int i = 1; i <= numOfCopies; i++) {
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing " + documents + " # "+i);
		}
	}

}
