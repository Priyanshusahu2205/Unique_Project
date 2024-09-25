package com.pattern;

import java.util.Scanner;

public class SwapNo {
	public static void main(String[] args) {
		//Create scanner object for taking input from user
		Scanner sc = new Scanner(System.in);
		
		//input 2 no.
		System.out.println("Enter First no.(a):");
		int a=sc.nextInt();
		System.out.println("Enter Second no.(b):");
		int b=sc.nextInt();
		
		
		System.out.println("Before swapping:a="+a+",b="+b);
		
		//swap logic without using a 3 var
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		
		System.out.println("After swapping:a="+a+",b="+b);
		//close the scanner  obj
		sc.close();
		
	}

}
