package com.abstraction;

import java.util.Scanner;

public class Circle extends Shape {
	Scanner sc = new Scanner(System.in);
	double r;
	Circle(){
		System.out.println("this is circle class");
	}
	void area() {
		
		System.out.println("Enter the radius:");
		r=sc.nextDouble();

		double ar=3.14*r*r;
		System.out.println("Area of the circle is "+ar);
		
		
		
	}

	
	/*Circle(){
		System.out.println("This is a shape of circle.");
	}
	
	void area() {
			
		System.out.println("Enter (r):");
		double r=sc.nextDouble();
		
		double pi=3.14,area;
		area= 3.14*r*r;
		
	}*/
	
	public static void main(String[] args) {
		System.out.println("Area of Circle:");
		Shape sp = new Circle();
		sp.area();
		
	}
		
}
