package com.fil.multi_threading;

public class Account{
	int balance;
	
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	


	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	 synchronized public void withdraw(int amount) {
		int balance = getBalance();
		if( balance <= amount) {
			return;
		}
		else {
			balance = balance - amount;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBalance(balance);
		System.out.println(getBalance());
	}
	
	

	
}
