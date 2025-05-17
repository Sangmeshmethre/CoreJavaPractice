package com.nt.B;

class InvalideAccountException extends Exception{
	public InvalideAccountException(String str) {
		super(str); //pass to exception 
	}
}

class BankAccount{
	
	void valideAccountNumber(String number) throws InvalideAccountException{
		
		if(number==null ||number.length() != 10) {
			throw new InvalideAccountException("Invalide account::"+number);
		}
		System.out.println("valide account::"+number);
	}
}
public class MainAccount {

	public static void main(String[] args) {
		
		BankAccount ac = new BankAccount();
		
		try {
			ac.valideAccountNumber("55838308403");
		}catch(InvalideAccountException  ie) {
			System.err.println("Error::"+ie.getMessage());
		}
	}
}
