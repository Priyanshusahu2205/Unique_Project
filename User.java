package com.lmsInterviev;

public class User {
	
	int id;
	String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
}

public class Employee extends User {
	
double salary;
	
	Employee(int id, String name, double salary){
		super(id,name);
		this.salary=salary;
		
	}
	double calculateAnnualSalary() {
		return salary* 12;
	}

}

public class Main {
	
public static void main(String[] args) {
		
		Employee e1 = new Employee(100,"Raaj",250000000);
		
		double annualSalary=e1.calculateAnnualSalary();
		System.out.println("Annual Salary of:"+e1.name+","+"Employee Id:"+e1.id+","+"is"+","+annualSalary);
	}

}
