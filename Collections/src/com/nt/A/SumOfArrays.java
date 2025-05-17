package com.nt.A;

public class SumOfArrays {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6, 10,2,1};
		int key = 12;
		
		int result = sumOfSubArray(arr, key);
		System.out.println("SumOfArray::"+result);
	}
	
	public static int sumOfSubArray(int[] arr, int key) {
		
		for(int i=0; i<arr.length; i++) {
			
			int sum = 0;
			
			for(int j=i+1; j<arr.length; j++) {
				
				sum = sum +arr[j];
				
				if(sum==key) {
					return i;
				}
			}
			if(arr[i]==key) {
				return 1;
			}
		}
		return -1;
	}
}
