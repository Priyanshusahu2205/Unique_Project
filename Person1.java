package com.inheritanceM;

public class Person1 {
	String name;
	int id;
	String city;
	
	
	public void print_info(String name, int id, String city) {
		System.out.println("Name:-"+name);
		System.out.println("Id:-"+id);
		System.out.println("City:-"+city);

	}

}
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
public class Main {
	public static void main(String[] args) {
			
			Student1 s1 = new Student1();
			
			s1.print_info("Raaj",22,"Bhilai");
			s1.print_info1("Priyanshu","Bhilai",1200000);
			s1.print_info2("Shipra","CSE",120);
			s1.print_info2("Priya","CSE",122);
			
		
	}

}
