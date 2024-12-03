package com.threadingdemo;

class Thread1 extends Thread {

    Thread1(String name, int priority) {
        super(name); // Set the thread name
        setPriority(priority); // Set the thread priority
    }

    // Execution logic
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Currently thread working: " + Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}

public class ThreadJoin {

    public static void main(String[] args) {
        // Create threads with proper names and priorities
        Thread1 t1 = new Thread1("Thread-1", Thread.NORM_PRIORITY);
        Thread1 t2 = new Thread1("Thread-2", Thread.NORM_PRIORITY);
        Thread1 t3 = new Thread1("Thread-3", Thread.NORM_PRIORITY);

        // Start and join threads sequentially
        t1.start();
        try {
            t1.join(); // Wait for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        try {
            t3.join(); // Wait for t3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
