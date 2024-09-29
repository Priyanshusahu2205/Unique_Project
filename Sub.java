package com.practice;

public class Sub extends Add {
	int c;
	int d;
	
	public int sub(int c, int d) {
		System.out.println("Subtract:");
		return c-d;
		
	}
	public static void main(String[] args) {
		
		Sub s1 = new Sub();
		System.out.println(s1.add(10,20));
		s1.add(10,20);
		System.out.println(s1.sub(40,20));
		s1.sub(40,20);
		
		
		
	}	

}
