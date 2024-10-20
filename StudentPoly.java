package com.polymorphism;

public class StudentPoly {
	
	public void print_info(String name) {
		System.out.println("Name of student:-"+name);
	}
	
	public void print_info(int age) {
		System.out.println("Age of studen:-"+age);
	}
	
	public void print_info(String branch,int age) {
		System.out.println("Branch:-"+ branch+age);
	}
	
	public static void main(String[] args) {
		//object creation
		StudentPoly s1 = new StudentPoly();
		//call
		s1.print_info("Raaj");
		s1.print_info(22);
		s1.print_info("CSE", 22);
	}
	
}
