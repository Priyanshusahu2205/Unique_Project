package com.inheritance3;

public class Parent {
	String name="Raaj";
	String id="p22";
	
	public Parent(String name, String id) {
		this.name=name;
		this.id=id;
	}
	
	//Method
	public void parent_method() {
		System.out.println("Parent method");
		
	}
	
	public void m1() {
		System.out.println("m1 ...");
		
	}

}
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
public class MainPC {
	public static void main(String[] args) {
		Child c1 = new Child("Raaj","p22","Bhilai");
		
		c1.printInfo();
		c1.parent_method();
		c1.m1();
		
	}

}
