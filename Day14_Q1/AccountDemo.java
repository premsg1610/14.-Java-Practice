package com.Day14_Q1;

public class AccountDemo {

	
	public static void main(String[] args) {
		
		System.out.println("Start of main");
		
		
		Account a1 = new Account("123456");
		a1.deposit(10000);
		
		try {
			double money = a1.withdraw(10005);
			
			
			System.out.println("Your withdrawn amount is: " + money);
			
		} 
		catch (InsufficientFundsException e) {
			
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		
		System.out.println("End of main");
		
	}
	
	
}
