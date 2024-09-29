package com.exception;

public class ExceptionTN {
	
	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("Here is an Null Pointer exception....");
		
	}

}
