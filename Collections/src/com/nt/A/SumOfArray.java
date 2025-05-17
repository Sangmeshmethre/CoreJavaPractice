package com.nt.A;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] arr = {3,-1, 5, -3,9};
		int key = -4;
		
		int result = sumOfArray(arr, key);
		System.out.println("sum of array::"+result);
	}
	
	public static int sumOfArray(int[] arr, int key) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==key) {
					return arr[i]+arr[j];
				}
			}
		}
		return -1;
	}
}
