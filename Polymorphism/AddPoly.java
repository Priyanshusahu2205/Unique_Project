package com.polymorphism;

public class AddPoly {
	//public int add
	public static int add(int a, int b) {
		return a+b;
	}
	//public double add
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		AddPoly add = new AddPoly();
		System.out.println(AddPoly.add(10,10));
		System.out.println(AddPoly.add(10,5));
	}

}
