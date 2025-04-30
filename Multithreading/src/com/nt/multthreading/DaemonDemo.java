package com.nt.multthreading;

public class DaemonDemo implements Runnable{

	Thread th;
	DaemonDemo(){
		th = new Thread(this);
		th.setDaemon(true);
		th.start();
	}
	
	public void run() {
		
		System.out.println("Run:"+th.isDaemon());
		
		for(int i=0; i<=100; i++) {
			System.out.println("Run::"+i);
		}
	}
	
	public static void main(String[] args) {
		DaemonDemo dd1 = new DaemonDemo();
		System.out.println("Baba countdown starts");
		
		for(int i=0;i<=5; i++) {
			System.out.println("main"+i);
		}
	}
}
