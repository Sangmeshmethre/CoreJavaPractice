package com.nt.B;

class InvalideAgeException extends RuntimeException{
	
	public InvalideAgeException(String name) {
		super(name); //pass to runtimeException 
	}
}

class Vote{
	
	void checkAge(int age) {
		if(age < 16) {
			throw new InvalideAgeException("invalide age for voting");
		}
		System.out.println("valide for voting");
	}
}
public class MainAge {

	public static void main(String[] args) {
		
		Vote vt = new Vote();
		
		try {
			vt.checkAge(18);
		}catch(InvalideAgeException ie) {
			System.out.println("Error::"+ie.getMessage());
		}
	}
}
