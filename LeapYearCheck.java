package com.lmsInterviev;

import java.util.Scanner;

public class LeapYearCheck {
	
	public static void main(String[] args) {
		
		//create scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Leap Year:");
		int year=sc.nextInt();
		
		//check year is leap year using if-else condt
		if(year %400==0) {
			System.out.println("This is a leap year.");
			
		}
		else if(year %100==0) {
			System.out.println("This is not a leap year.");
		}
		else if(year %4==0) {
			System.out.println("This is a leap year.");
		}
		else {
			System.out.println("This is not a leap year.");
			
		}
	}
}
