package com.nt.CustomeException;

public class HDFCBank implements Bank{

	private double balance;
	public void deposite(double amt) throws InvalidAmountException{
		
		if(amt < 0) {
			throw new InvalidAmountException(amt+" is invalid amount");
		}
		
		balance = balance+amt;
	}
	@Override
	public double withdrow(double amt) throws InSufficientFundsException{
		
		if(balance < amt) {
			throw new InSufficientFundsException("InSufficient Founds");
		}
		
		balance = balance-amt;
		
		return amt;
	}
	

	@Override
	public void blanceEnquiry() {
		System.out.println("Current Balance::"+balance);
		
	}
}
