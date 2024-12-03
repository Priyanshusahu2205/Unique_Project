package com.threadingex;

class Thread1 extends Thread {
	Thread1 (String name,int priority){
		//set priority
		super (name);
		setPriority(priority);
	}
	//execution
	public void run() {
		for(int i=0;i<8;i++) {
			System.out.println(getName()+"Numbers="+""+i);
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
public class ThreadM {
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("High priority thread",Thread.MAX_PRIORITY);
		Thread1 t2 = new Thread1("Mid level priority thread",Thread.NORM_PRIORITY);
		Thread1 t3 = new Thread1("Min priority thread",Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
