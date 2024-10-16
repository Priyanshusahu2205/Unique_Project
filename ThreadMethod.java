package com.multiThreadingEx;

class ThreadEx implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Using Runnable interface...");
		
		for(int i=0;i<=20;i++) {
			if(i%2==0);
			System.out.println(i);
		}
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
	
}
public class ThreadMethod {
	
	public static void main(String[] args) {
		ThreadEx runnable = new ThreadEx();
		Thread t1 = new Thread(runnable);
		t1.start();
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.getStackTrace();
		}
	}

}
