package com.nt.p1;

class InvalideAccountNumberException extends Exception{
	public InvalideAccountNumberException(String name) {
		super(name); //pass new to Exception class
	}
}

class BankAccount{
	
	void checkAccount(String name) throws InvalideAccountNumberException{
		
		if(name==null || name.length() != 10) {
			throw new InvalideAccountNumberException("Invalide Account number::"+name);
		}
		System.out.println("Valide AccountNumber::"+name);
	}
}
public class MainAccount {

	public static void main(String[] args) {
		BankAccount name = new BankAccount();
		
		try {
			name.checkAccount("12345678");
		}catch(InvalideAccountNumberException ie) {
			System.out.println("Error::"+ie.getMessage());
		}
		
	}
}
