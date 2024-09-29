package com.exception;

import java.util.Scanner;

public class UPIException extends Exception {
	
	UPIException(String msg){
		super(msg);
	}
	
	static void validUPI(int upi_id) throws UPIException{
		if(upi_id!=1234) {
			throw new UPIException("Your UPI id is not Correct.");
			
		}
		else {
			System.out.println("Your UPI id is Correct you can proceed.");
			
		}			
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UPI id:");
		int a=sc.nextInt();
		
		try {
			validUPI(a);
			
		}
		catch(UPIException e) {
			System.out.println("Exception Occured:"+e.getMessage());
		}
		sc.close();
	}


}
