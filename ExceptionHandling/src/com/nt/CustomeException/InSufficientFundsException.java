package com.nt.CustomeException;

public class InSufficientFundsException extends Exception{

	public InSufficientFundsException() {
		super();
	}
	
	public InSufficientFundsException(String msg) {
		super(msg);
	}
}
