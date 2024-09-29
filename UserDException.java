package com.exception;

import java.util.Scanner;

public class UserDException extends Exception {
	
	UserDException(String msg){
		super (msg);
		
	}
	
	static void validate(int year) throws UserDException{
		if(year %4 !=0) {
			throw new UserDException("No it's not a Leap year.");	
		}
		else {
			System.out.println("Yes it's a Leap year.");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Leap year:");
		int year=sc.nextInt();
		
		try {
			validate(year);
			
		}
		catch(UserDException e) {
			System.out.println("Exception occured:"+e.getMessage());
	
		}
		sc.close();

	}
		
}
