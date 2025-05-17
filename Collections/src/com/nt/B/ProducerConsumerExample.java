package com.nt.B;

import java.util.LinkedList;

class ResourceShare{
	
	private final LinkedList queue = new LinkedList();
	private final int DIMIT = 5;
	
	synchronized void producer(int value) throws InterruptedException{
		if(queue.size()==DIMIT) {
			wait();
		}
		queue.add(value);
		System.out.println("Producer::"+value);
		notify();
	}
	synchronized void consumer() throws InterruptedException{
		if(queue.isEmpty()) {
			wait();
		}
		Object value = queue.removeFirst();
		System.out.println("consumer::"+value);
		notify();
	}
}
public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		ResourceShare resource = new ResourceShare();
		
		Thread th1 = new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					resource.producer(i);
					Thread.sleep(500);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		Thread th2 = new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					resource.consumer();
					Thread.sleep(500);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		th1.start();
		th2.start();
	}
}
