package com.nt.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionInner {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int a = -1;
			int b = -1;
			
			while(true) {
				try {
					System.out.println("Enter first number::");
					a = Integer.parseInt(br.readLine());
					break;
				}catch(NumberFormatException nfe) {
					System.out.println("Wrong input:Enter only number");
				}
			}
			while(true) {
				try {
					System.out.println("Enter second number:");
					b = Integer.parseInt(br.readLine());
					
					try {
						int c = a/b;
						System.out.println("Result::"+c);
						
					}catch(ArithmeticException ae) {
						System.out.println("Wrong input Do not pass Zero");
						continue;
					}
					break;
				}catch(NumberFormatException nef) {
					System.out.println("Wrong input: inter only number");
				}
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
