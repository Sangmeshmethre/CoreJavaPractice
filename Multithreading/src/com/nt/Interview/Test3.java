package com.nt.Interview;

public class Test3 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Run");
			}
		};
		r.start();
		System.out.println("main");
	}
}
