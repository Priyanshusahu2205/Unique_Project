package com.inheritanceM;

public class Student1 extends Employee1 {
	
	String name="Priya";
	String dept="CSE";
	int roll=122;
	
	public void print_info2(String name, String dept, int roll) {
		System.out.println("Name of Student:-"+name);
		System.out.println("Department:-"+dept);
		System.out.println("Roll. No.:-"+roll);
		
	}
	

}
