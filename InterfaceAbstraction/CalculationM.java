package com.interfaceAbs;

import java.util.Scanner;

public class CalculationM implements Calculator {
	
	//Scanner sc = new Scanner(System.in);
	//double a,b,c;

	@Override
	public void add(double a, double b) {
		//a=sc.nextDouble();
		//b=sc.nextDouble();
		double c=a+b;
		System.out.println("Addition of a & b:"+c);
		
	}

	@Override
	public void subtract(double a, double b) {
		//a=sc.nextDouble();
		//b=sc.nextDouble();
		double c=a-b;
		System.out.println("Subtraction of a & b:"+c);
		
	}

	@Override
	public void multiply(double a, double b) {
		//a=sc.nextDouble();
		//b=sc.nextDouble();
		double c=a*b;
		System.out.println("Multiplication of a & b:"+c);
		
	}

	@Override
	public void division(double a, double b) {
		//a=sc.nextDouble();
		//b=sc.nextDouble();
		 if (b == 0) {
	            System.out.println("Error: Division by zero is undefined.");
	     }
		 else {
			double c=a/b;
			System.out.println("Division of a & b:"+c);
		 }
		
	}
	
	public static void main(String[] args) {
		System.out.println("Calculation:");
		
		Calculator c1 = new CalculationM();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a & b:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		c1.add(a,b);
		c1.subtract(a,b);
		c1.multiply(a,b);
		c1.division(a,b);
		
		sc.close();
		
	}

}
