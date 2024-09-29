package com.college;

public class Student {
		
	//data members
	String name;
	String department;
	String location;
		
	public void printInfo() {
		System.out.println("student info.....");
	}	

}
public class Main {

	public static void main(String[] args) {
		// object creation
		
		Student s1= new Student();
		s1.name="Ram";
		s1.department="CSE";
		s1.location="Bhilai";
		
		s1.printInfo();
		System.out.println(s1.name);
		System.out.println(s1.department);
		System.out.println(s1.location);
	

	}
}

