package com.encapsulation;

public class MainEncapsulation {
	
	public static void main(String[] args) {
		//method call
		Student s1 = new Student();
		s1.name="Raaj";
		System.out.println(s1.name);
		s1.setPassword("Raaj@123");
		s1.getPassword();
		System.out.println(s1.getPassword());
		
	}
	 
	

}
