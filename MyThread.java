package com.waitandnotify;

public class MyThread extends Thread {
	
	//declare an sum variable
	int sum=0;
	
	public void run() {
		//synchronized this keyword refer to current obj
			synchronized(this) {
				//calculate the sum
				System.out.println("Child thread is start working...");
				
				for(int i=0;i<=10;i++) {
					//last sum is final sum or we say
					sum+=i;//sum=sum+i
					System.out.println("Sum="+sum);
					
				}
				System.out.println("Child thread trying to notify the main thread...");
				this.notify();
					
			}
	}
	

}
