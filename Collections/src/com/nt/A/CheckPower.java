package com.nt.A;

public class CheckPower {

	public static void main(String[] args) {
		
		int number = 10;
		
		boolean result = checkPower(number);
		System.out.println("result::"+result);
	}
	public static boolean checkPower(int num) {
		
		boolean result = true;
		
		while(num > 1) {
			
			if(num % 2 != 0) {
				result = false;
			}
			num = num / 10;
		}
		return result;
	}
}
