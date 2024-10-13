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
public class ActivaG extends Activa {
	
	//constructor
	ActivaG(){
		System.out.println("I have a Smart and Latest Features");
		
	}
	 public static void speed() {
		 System.out.println("120");
		 
	 }

}
public class Main {
	
	public static void main(String[] args) {
		
		//object
		ActivaG a1 = new ActivaG();
		a1.speed();
		a1.speed("ActivaG", 80000.5);
		
		System.out.println(a1.name="ActivaG");
		
		System.out.println(a1.price=90000.5);
	}

}
