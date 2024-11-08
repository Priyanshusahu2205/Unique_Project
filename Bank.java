package com.lmsInterviev;

public class Bank {
	private double amount;
	
	public Bank(double a){
		this.amount= a;
		
	}
	
	public void withdraw(double withdrawlAmount) {
		
		String msg=(withdrawlAmount<=amount)?"Withdrawl Successful":"Insufficient balance";
		System.out.println(msg);
		
		amount=(withdrawlAmount<=amount)?(amount-withdrawlAmount):amount;
		
	}
	
	public void deposit(double depositAmount) {
		amount+=depositAmount;
		System.out.println("Deposit successful.");
		
	}
	public void displayBalance() {
		System.out.println("Total Balance:"+amount);
		
	}
	public static void main(String[] args) {
		Bank a = new Bank(10000);
		a.withdraw(3000);
		a.deposit(5000);
		a.displayBalance();
	}

}
