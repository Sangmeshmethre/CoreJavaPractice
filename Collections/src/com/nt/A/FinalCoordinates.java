package com.nt.A;

import java.util.Scanner;

public class FinalCoordinates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter String::");
		String str = sc.nextLine();
		
		finalCoordinates(str);
	}
	public static void finalCoordinates(String str) {
		int x = 0, y = 0;
		for(char direction :str.toCharArray()) {
			switch(direction) {
			case'L':
				x = x-1;
				break;
			case 'R':
				x = x+1;
				break;
			case'U':
				y = y+1;
				break;
			case 'D':
				y = y-1;
				break;
				default:
					System.out.println("Invalide direction:");
			}
		}
		System.out.println("Final Coordinates::("+x+","+y+")");
	}
}
