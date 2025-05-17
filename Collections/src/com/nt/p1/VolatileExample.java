package com.nt.p1;

public class VolatileExample extends Thread{

	public volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println(Thread.currentThread()+"is running.....");
		}
	}
	public void  stopThread() {
		running  = false;
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		VolatileExample vt = new VolatileExample();
		vt.start();
		Thread.sleep(300);
		vt.stopThread();
		
		System.out.println("main thread updated the running flag");
	}
}
