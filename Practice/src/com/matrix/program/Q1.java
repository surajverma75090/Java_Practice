package com.matrix.program;

 
public class Q1 {
	public static void main(String[] args) {
		
	
		int [] arr = {9,12,8,14,16};
        double S[]=new double[arr.length];
		double C[]=new double[arr.length];
		for(int i =0;i<arr.length;i++) {
			
			S[i]=Math.sqrt(arr[i]);
			C[i]=Math.cbrt(arr[i]);
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(S[i]+" "+C[i]);
		}
		
		
		
	}

}
