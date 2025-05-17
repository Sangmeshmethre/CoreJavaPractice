package com.nt.A;

public class MinimumElementArray {

	public static void main(String[] args) {
		
		int[] arr = {5,6,1,2,3,4};
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Element::"+min);
	}
}
