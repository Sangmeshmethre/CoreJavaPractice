package com.nt.B;

public class VolatileExample extends Thread{
	
	private volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println(Thread.currentThread().getName()+" running");
		}
	}
	
	public void stopThread() {
		running = false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		VolatileExample th = new VolatileExample();
		th.start();
		Thread.sleep(500);
		th.stopThread();
		System.out.println("Main thread is updated ");
	}

}
