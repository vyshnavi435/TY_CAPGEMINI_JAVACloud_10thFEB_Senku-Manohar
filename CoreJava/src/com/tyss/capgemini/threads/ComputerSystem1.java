package com.tyss.capgemini.threads;

public class ComputerSystem1 extends Thread {
	PrintingApplication printingApplication;
	
	public ComputerSystem1(PrintingApplication localPrintingApplication) {
	this.printingApplication = localPrintingApplication;
	}
	
	public void run() {
		System.out.println(">>>> Printing from ComputerSystem1");
		printingApplication.printingDocuments("numOfCopies of some",10);
		
	}
	
	

}
