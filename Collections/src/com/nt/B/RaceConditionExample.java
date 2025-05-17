package com.nt.B;

class Bank{
	private double balance = 100;
	
	void withdraw(int amount) {
		if(balance>=amount) {
			System.out.println("Before withdrow balance::"+amount);
			balance = balance-amount;
			System.out.println("After withdraw balance::"+balance);
		}else {
			System.out.println("Invalide balance::"+balance);
		}
	}
}
public class RaceConditionExample {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		Runnable task = ()->b.withdraw(70);
		
		Thread th1 = new Thread(task, " Thread-1 ");
		Thread th2 = new Thread(task, " Thread-2 ");
		
		th1.start();
		th2.start();
	}
}
