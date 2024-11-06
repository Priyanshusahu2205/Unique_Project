package com.lmsInterview10;

class NumberP extends Thread{
	
	//printing no. from 0 to 4
	public void run() {
		
		//for loop to increment the no.
		for(int i=0;i<5;i++) {
			System.out.println(i);
			
		}
	}
//}
//public class NumberP {
	
	//main method to call
	public static void main(String[] args) {
		NumberP thread = new NumberP();
		System.out.println("Number:");
		thread.start();
	}

}
