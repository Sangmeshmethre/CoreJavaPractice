package com.nt.multthreading;

public class SequentialMyRunnable extends Thread{

	public void run() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("run::"+i);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
		SequentialMyRunnable mr = new SequentialMyRunnable();
		
		mr.run();
		
		for(int i=0;i<10; i++) {
			
			System.out.println("main::"+i);
		}
	}
}
