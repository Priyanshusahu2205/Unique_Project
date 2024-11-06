package com.lmsInterview10;

class PrintNo implements Runnable {
	
	//print the no. from 0 to 10 with delay
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i =0;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Printing the number:");
		}
	
	}
//}
//public class PrintNo {
	
	//main method to call
	public static void main(String[] args) {

		Thread th = new Thread(new PrintNo());
		System.out.println("The number is:");
		th.start();
	}

}
