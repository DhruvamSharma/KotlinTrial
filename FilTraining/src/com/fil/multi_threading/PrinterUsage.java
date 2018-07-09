package com.fil.multi_threading;

public class PrinterUsage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Printer printer = new Printer();
		
		PrinterUser user1 = new PrinterUser(printer);
		PrinterUser user2 = new PrinterUser(printer);
		user1.start();
		user2.start();
		
		user1.join();
		user2.join();
		
		System.out.println("End is here!" + Thread.currentThread().getName());

	}

}
