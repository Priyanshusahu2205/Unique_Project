package com.inheritance3;

public class Child extends Parent {
	
	String city;
	
	
	public Child(String name, String id, String city) {
		//parent constructor
		super(name,id);
		this.city=city;
		
	}
	
	
	public void printInfo() {
		System.out.println(name+" "+id+" "+city);
		System.out.println("Parent class variable:"+super.name);
		super.parent_method();
		
		
	}
	

}
