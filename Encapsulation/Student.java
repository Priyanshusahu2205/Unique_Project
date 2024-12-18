package com.encapsulation;

public class Student {
	//fully encapsulated class
	public String name;
	private String password;
	protected String msg ="Try to access protected data with package";
	
	protected void msg1() {
		System.out.println("Access outside package with interface");
	}
	//setter getname method
	//get method
	
	public String getPassword() {
		return password;
		
	}
	//set
	public void setPassword(String password) {
		this.password=password;
	}
	

}
