package com.inheritance2;

public class MainB {
	public static void main(String[] args) {
		
		//object creation
		SBI s1 = new SBI();
		s1.rbi_loan_dept();
		s1.rate_interest();
		s1.sbi_info();
		
		//2nd swiss
		Swiss sw1 = new Swiss();
		sw1.rbi_loan_dept();
		sw1.rate_interest();
		sw1.swiss_info();
		
		}

}
