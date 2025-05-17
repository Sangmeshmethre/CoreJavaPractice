package com.nt.p1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=1; i<=10; i++) {
			int taskNumber = i;
			
			executor.execute(()->{
				System.out.println("running thread::"+taskNumber+Thread.currentThread().getName());
			});
		}
		executor.shutdown();
	}
}
