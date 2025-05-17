package com.nt.p1;

class InvalideBalanceException extends Exception{
	public InvalideBalanceException(String name) {
		super(name); //pass to exception class 
	}
}
class BankBalance{
	private double balance = 5000;
	
	void withdraw(double amount) throws InvalideBalanceException{
		if(amount > balance) {
			throw new InvalideBalanceException("Invalid balance in acount!");
		}
		balance = balance-amount;
		System.out.println("Remaing Balance::"+balance);
	}
}
public class MainException {

	public static void main(String[] args) {
		BankBalance bk = new BankBalance();
		
		try {
			bk.withdraw(4000);
		}catch(InvalideBalanceException ie) {
			ie.printStackTrace();
		}
	}
}
