package com.nt.A;

public class MaximumPathSumMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{10, 10, 2, 0, 20, 4},
				{1, 0, 0, 30, 2, 5},
				{0, 1,0,4,0,2,0},
				{1, 0, 2, 20, 0, 4}
		};
		
		maximumPathSum(matrix);
	}
	public static void maximumPathSum(int[][] matrix) {
		
		int sum  = -1;
		for(int i=1; i<matrix.length; i++) {
			sum = -1;
			for(int j=0; j<matrix[0].length; j++) {
				
				if(j> 0 && j<matrix[0].length-1) {
					matrix[i][j] = matrix[i][j]+max(matrix[i-1][j-1], max(matrix[i-1][j], matrix[i-1][j+1]));
				}else if(j>0) {
					matrix[i][j] = matrix[i][j] + max(matrix[i-1][j-1], matrix[i-1][j]);
				}else if(j < matrix[0].length-1) {
					matrix[i][j] = matrix[i][j]+max(matrix[i-1][j], matrix[i-1][j+1]);
				}
				sum = max(sum, matrix[i][j]);
			}
		}
		System.out.println("Minimum Path sum is:"+sum);
	}
	
	private static int max(int a, int b) {
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
}
