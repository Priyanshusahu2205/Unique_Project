package com.lmsInterviev;

import java.util.Scanner;

public class StrongNumber {
	//method to calc factorial no.
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact *=i;
		}
		return fact;
	}
	
	//main method to check strong no.
	public static void main(String[] args) {
		
		//create scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int originalNum=num;
		
		int sum=0;
		
		//while loop through each digit of no.
		while(num>0) {
			int digit=num%10;
			sum+=factorial(digit);
			num /=10;
			
		}
		
		//check if sum of factorial of digit equal to orig no.
		if(sum == originalNum) {
			System.out.println("This is a Strong Number.");
			
		}
		else {
			System.out.println("This is not a Strong Number.");
		}
		
	}

}
