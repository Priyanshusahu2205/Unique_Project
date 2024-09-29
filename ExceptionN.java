package com.exception;

public class ExceptionN {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
		} 
		
		catch(ArithmeticException e) {
			
			System.out.println(e.toString());
			System.out.println("Code of Exception");
			System.out.println(e.getMessage());
		}
	}


}
