package com.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeComparatorI {
	
	
	String name;
	int age;
	
	//constructor
	EmployeeComparatorI(String name,int age){
		
		this.name=name;
		this.age=age;
	}

}
public class Name implements Comparator<EmployeeComparatorI> {

	@Override
	public int compare(EmployeeComparatorI o1, EmployeeComparatorI o2) {
		// TODO Auto-generated method stub
		//this method is from string class
		o1.name.compareTo(o2.name);
		return 0;
	}

}
public class Age implements Comparator<EmployeeComparatorI> {

	@Override
	public int compare(EmployeeComparatorI o1, EmployeeComparatorI o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}

}
public class MainE1 {
	
	public static void main(String[] args) {
		//arrarlist
		ArrayList<EmployeeComparatorI> a1 = new ArrayList<EmployeeComparatorI>();
		
		//add
		a1.add(new EmployeeComparatorI("Priyanshu",22));
		a1.add(new EmployeeComparatorI("Shipra",21));
		a1.add(new EmployeeComparatorI("Priya",23));
		
		//Sorting
		Collections.sort(a1,new Age());
		System.out.println("Sorting data by age=");
		for(EmployeeComparatorI obj:a1) {
			System.out.println(obj.age+""+obj.name);
		}
		//multiple
		Collections.sort(a1,new Name());
		System.out.println("Sorting data by name=");
		for(EmployeeComparatorI obj1:a1) {
			System.out.println(obj1.age+""+obj1.name);
		}
	}

}

