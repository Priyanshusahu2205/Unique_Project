package com.inheritance1;

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
