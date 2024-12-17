package com.polymorphism;

public class EmployeePoly {
	public void print_info(String name, int id)
	{
		System.out.println("My name and id:-"+name+id);
	}
	
	public void print_info(int id, int salary)
	{
		System.out.println("My id and salary:-"+id+salary);
	}
	
	public void print_info(String name, String desg)
	{
		System.out.println("My name and designation is"+name+desg);
	}
	
	public static void main(String[]args)
	{
		EmployeePoly e1 = new EmployeePoly();
		e1.print_info("Raaj", 100);
		e1.print_info(100, 10000);
	}
	

}
