package com.nt.A;

public class RevesedNumber {

	public static void main(String[] args) {
		
		int number = 10234;
		
		int rev = 0;
		
		while(number > 0) {
			int least = number%10;
			rev = rev*10+least;
			number = number/10;
		}
		System.out.println("reversed::"+rev);
	}
}
