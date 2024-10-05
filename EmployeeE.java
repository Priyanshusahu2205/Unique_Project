package com.comparableandComparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeE implements Comparable<EmployeeE> {
	
	//add data
	int id;
	String name;
	int salary;
	
	//constructor
	EmployeeE(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compareTo(EmployeeE o) {
		// TODO Auto-generated method stub
		if(salary==o.salary)
		return 0;
		else if(salary> o.salary)
			return 1;
		else
			return -1;
		
	}

}
public class MainEe {
	
	public static void main(String[] args) {
		//arrarlist
		ArrayList<EmployeeE> a1 = new ArrayList<EmployeeE>();
		
		//add
		a1.add(new EmployeeE(100,"Priyanshu",1500000000));
		a1.add(new EmployeeE(101,"Shipra",2500000));
		a1.add(new EmployeeE(102,"Priya",500000));
		
		//Sorting
		Collections.sort(a1);
		for(EmployeeE obj:a1) {
			System.out.println(obj.id+""+obj.name+""+obj.salary);
		}
		
	}	
	
}
