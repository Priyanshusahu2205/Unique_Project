package com.exception;

public class ExceptionExF {
	
	public static void main(String[] args) {
		try {
			int a=100/0;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		/*System.out.println("Code of Exception...");
		System.out.println("Code of Try and Catch...");*/
		
		finally {
			System.out.println("Code of Final Exception connection is closed...");
			System.out.println("Finally block is executed...");
			
		}
		
	}

}
