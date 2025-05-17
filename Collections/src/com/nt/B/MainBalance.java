package com.nt.B;

class InvalideBalanceException extends Exception{
	
	public InvalideBalanceException(String name) {
		super(name); //pass to checked exception
	}
}

class BankBalance{
	private double balance = 5000;
	
	void withdraw(double amount) throws InvalideBalanceException{
		if(amount > balance) {
			throw new InvalideBalanceException("Invalide Balance in your account::"+amount);
		}
		balance = balance-amount;
		System.out.println("Balance in our account::"+balance);
	}
}
public class MainBalance {

	public static void main(String[] args) {
		
		BankBalance bk = new BankBalance();
		try {
			bk.withdraw(6000);
		}catch(InvalideBalanceException ie) {
			System.out.println("Error::"+ie.getMessage());
		}
	}
}
