package com.nt.A;

public class SmallestMessingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,5,6};
		
		missingNumber(arr);
	}
	
	public static void missingNumber(int[] arr) {
		
		int sum1 = 0, sum2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum1 = sum1+ arr[i];
		}
		
		for(int i=1; i<=6; i++) {
			sum2 = sum2+i;
		}
		
		System.out.println("Missing Number::"+(sum2-sum1));
	}
}
