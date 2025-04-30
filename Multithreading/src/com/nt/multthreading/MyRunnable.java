package com.nt.multthreading;

public class MyRunnable extends Thread{

	public void run() {
		
		for(int i=0; i<10;i++) {
			System.out.println("run::"+i);
		}
	}
	
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		mr.start();
		
		for(int i=0;i<10; i++) {
			System.out.println("main::"+i);
		}
	}
}
