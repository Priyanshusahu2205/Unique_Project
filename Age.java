package com.practice;

public class Age {
	static int age = 25;
	
	public static void main(String[] args) {
		if (age < 13) {
		    System.out.println("Child");
		} else if (age >= 13 && age <= 19) {
		    System.out.println("Teenager");
		} else if (age >= 20 && age <= 64) {
		    System.out.println("Adult");
		} else {
		    System.out.println("Senior");
		}
	}

}
