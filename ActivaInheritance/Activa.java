package com.inheritance1;

public class Activa {
	String name;
	double price;
	
	Activa(){
		System.out.println("I have a features");
		
	}
	
	public static void speed() {
		System.out.println("100");
		
	}
	//method
	public void speed(String name, double price) {
		System.out.println("My new bike:"+name+""+price);
	}

}
