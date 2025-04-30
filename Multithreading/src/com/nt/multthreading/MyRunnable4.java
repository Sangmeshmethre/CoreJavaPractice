package com.nt.multthreading;

public class MyRunnable4 extends Thread{

	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Run::"+i);
		}
	}
	
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		mr.start();
		mr.start();
		for(int i=0; i<10; i++) {
			
			System.out.println("Main::"+i);
		}
	}
}
