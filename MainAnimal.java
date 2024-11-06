package com.lmsInterview4;

import java.util.Scanner;

public class Animal {
	
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}

}
public class Dog extends Animal {
	
	public void makeSound() {
		System.out.println("The dog barks.");
	}

}
public class Cat extends Animal {
	
	public void makeSound() {
		System.out.println("The cat meows.");
	}

}
public class MainAnimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type of Animal (Dog or Cat):");
		String type=sc.nextLine();
		
		Animal al;
		
		if(type.equalsIgnoreCase("Dog")) {
			al = new Dog();
		}
		else if(type.equalsIgnoreCase("Cat")) {
			al = new Cat();
		}
		else {
			System.out.println("Invalid input.");
			return;
			
		}
		
		al.makeSound();
		
		sc.close();
	}

}
