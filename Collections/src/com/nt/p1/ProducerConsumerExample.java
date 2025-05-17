package com.nt.p1;

import java.util.LinkedList;

class ShareResource1 {
	private final LinkedList queue = new LinkedList<>();
	private final int DIMIT = 5;
	
	synchronized void producer(int value) throws InterruptedException{
		
		if(queue.size()==DIMIT) {
			System.out.println("producer is waiting.........");
			wait();
		}
		queue.add(value);
		System.out.println("Producer::"+value);
		notify();
	}
	
	synchronized void consumer() throws InterruptedException{
		if(queue.isEmpty()) {
			System.out.println("Consumer waiting..........");
			wait();
		}
		Object value = queue.removeFirst();
		System.out.println("consumer::"+value);
		notify();
	}
}
public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		ShareResource1 resource = new ShareResource1();
		
		Thread th1 = new Thread(()->{
			try {
				for(int i=1; i<=5; i++) {
					resource.producer(i);
					System.out.println("Producer 1::"+i);
					Thread.sleep(500);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		Thread th2 = new Thread(()->{
			try {
				for(int i=1; i<=5; i++) {
					resource.consumer();
					System.out.println("consumer1::"+i);
					Thread.sleep(1000);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		th1.start();
		th2.start();
	}
}
