package com.calculation;

public class Calculator {
	
	public static void main(String[]args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.cal(1,4));
		System.out.println(c1.cal(1,2));
		System.out.println(c1.cal(2,4));
		System.out.println(c1.cal(3,4));
		System.out.println(c1.cal(2,5));
	}
	
	double cal(int a, double b) {
		return a+b;
	}
	
	double cal(double c, int d) {
		return c-d;
	}
	
	double cal(int e, int f) {
		return e*f;
	}
	
	double cal(double g, double h) {
		return g/h;
	}

}
