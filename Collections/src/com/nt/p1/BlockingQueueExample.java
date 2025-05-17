package com.nt.p1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		
		BlockingQueue queue = new LinkedBlockingQueue<>(5);
		
		Thread th1 = new Thread(()->{
			try {
				for(int i=1; i<10; i++) {
					queue.put(i);
					System.out.println("producer::"+i);
					Thread.sleep(500);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		Thread th2 = new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					Object value = queue.take();
					System.out.println("consumer::"+value);
					Thread.sleep(100);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		th1.start();
		th2.start();
	}
}
