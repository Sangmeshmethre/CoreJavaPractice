package com.nt.p1;

class Bank{
	private double balance = 100;
	
	void withdraw(double amount) {
		if(balance >= amount) {
			System.out.println("total balance::"+amount);
			balance = balance-amount;
			System.out.println("remaingn balance::"+balance);
		}else {
			System.out.println(balance +" insuficient balance");
		}
	}
}
public class RaceExample {

	public static void main(String[] args) {
		
		Bank bk = new Bank();
		
		Runnable task = ()->bk.withdraw(70);
		
		Thread th1 = new Thread(task, "Thread-1");
		Thread th2 = new Thread(task, "Thread-2");
		
		th1.start();
		th2.start();
	}
}
