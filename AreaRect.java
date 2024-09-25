package com.practice;

import java.util.Scanner;

public class AreaRect {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter (l):");
		int l=sc.nextInt();
		
		System.out.println("Enter (b):");
		int b=sc.nextInt();
		
		
		
		int Area=l*b;
		System.out.println("Area of Rectangle:"+Area);
		
	}

}
