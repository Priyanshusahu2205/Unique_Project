package com.inheritanceM;

public class Employee1 extends Person1 {
	String name;
	String city;
	int salary;
	
	public void print_info1(String name, String city, int salary) {
		
		System.out.println("Name of Employee:-"+name);
		System.out.println("City:-"+city);
		System.out.println("Salary:-"+salary);
		
	}

}
