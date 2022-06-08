package com.Day14_Q1;

public class Account {

	String accountNumber;
	double balance;
	
	
	public Account(String string) {
		this.accountNumber = string;
	}

	public void deposit(double amount) {
		this.balance = amount;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException {
		
		if(this.balance >= amount)
		{
			return amount;
		}
		else {
			
			InsufficientFundsException ife = new InsufficientFundsException("Insufficient balance in your account");
			throw ife;
		}
	}
}
