package com.nt.A;

public class DuplecateElement {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,8,2,4,5,6};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]+" ");
				}
			}
		}
	}
}
