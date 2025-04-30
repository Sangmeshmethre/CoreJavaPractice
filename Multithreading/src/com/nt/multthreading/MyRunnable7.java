package com.nt.multthreading;

public class MyRunnable7 extends Thread{

	public void run() {
		System.out.println("Run");
	}
	
	public void start() {
		System.out.println("Start methdo");
		run();
	}
	
	public static void main(String[] args) {
		
		MyRunnable7 mr = new MyRunnable7();
		mr.start();
	}
}
