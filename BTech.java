package com.inheritance;

public class BTech {
	
	String dept;
	int id;
		
	public BTech() {
		System.out.println("BCS College");
			
	}
		
	public void displayCollege(String dept, int id) {
		System.out.println("Department is:-"+ dept +","+ "Id is:-"+id);
			
			
	}

}
public class MCA extends BTech {
	MCA(){
		System.out.println("This is MCA object");
	}

}
public class Main {
	public static void main(String[] args) {
		BTech b1 = new BTech();
		
		b1.displayCollege("CSE",22);
		
	}

}
