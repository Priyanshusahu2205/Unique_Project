package com.abstraction;

public abstract class Shape {
	
	Shape(){
		System.out.println("The circle in a two-dimensional plane.");
	}
	
	public void info() {
		
		System.out.println(" This is Shape of Circle.");
	}
	
	abstract void area();

}
