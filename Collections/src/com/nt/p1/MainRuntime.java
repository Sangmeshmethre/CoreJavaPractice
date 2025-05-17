package com.nt.p1;

class InvalideAgeException extends RuntimeException{
	public InvalideAgeException(String name) {
		super(name);  //pass to runtimeexception
	}
}

class Vote{
	
	void checkAge(int age) {
		if(age < 16) {
			throw new InvalideAgeException("Invalid age for voting::");
		}
		System.out.println("valide age for voting");
	}
}
public class MainRuntime {

	public static void main(String[] args) {
		
		Vote v = new Vote();
		
		try {
			v.checkAge(12);
		}catch(InvalideAgeException ie) {
			System.out.println("Error::"+ie.getMessage());
		}
	}
}
