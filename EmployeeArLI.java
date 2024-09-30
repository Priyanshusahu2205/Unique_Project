package com.arrayList;

class Employee{
	int id;
	String name;
	String city;
	double salary;
	//constructor
	
	public Employee(int id, String name, String city, double salary){
		
		this.id=id;
		this.name=name;
		this.city=city;
		this.salary=salary;
		
	}
	public void display() {
		System.out.println("Employee id:"+id+","+name+","+city+","+salary);
		
	}
}
public class EmployeeArLI {
	
	public static void main(String[] args) {
		
		//declare array of employee
		Employee arr[];
		arr = new Employee[3];
		arr[0]=new Employee(1,"Priyanshu","Bhilai",1500000000);
		arr[1]=new Employee(2,"Priya","Durg",2500000);
		arr[2]=new Employee(3,"Shipra","Bhilai Nagar",5000000);
		
		System.out.println("First Employee data=");
		arr[0].display();
		System.out.println("Second Employee data=");
		arr[1].display();
		System.out.println("Third Employee data=");
		arr[2].display();
		
	}
	
}

