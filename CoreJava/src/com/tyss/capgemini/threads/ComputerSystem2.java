package com.tyss.capgemini.threads;

public class ComputerSystem2 extends Thread {
	PrintingApplication printingApplication;
	
	public ComputerSystem2(PrintingApplication localPrintingApplication) {
	this.printingApplication = localPrintingApplication;
	}
	
	public void run() {
		System.err.println(">>>> Printing from ComputerSystem2");
		printingApplication.printingDocuments("numOfCopies",10);
	}

}
