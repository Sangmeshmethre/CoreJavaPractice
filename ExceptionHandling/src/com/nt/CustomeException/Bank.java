package com.nt.CustomeException;

public interface Bank {

	public void deposite(double amt) throws InvalidAmountException;
	public double withdrow(double amt) throws InSufficientFundsException;
	public void blanceEnquiry();
}
