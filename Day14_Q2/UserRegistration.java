package com.Day14_Q2;

import java.util.Scanner;

public class UserRegistration {

	
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		if(!userCountry.equals("India"))
		{
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
		else {
			System.out.println("User registration done successfully");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your country:");
		String country = sc.nextLine();
		
		sc.close();
		
		UserRegistration ur = new UserRegistration();
		
		try {
			ur.registerUser(country, country);
		} 
		catch (InvalidCountryException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
