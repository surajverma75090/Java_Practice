package com.array.program;

public class Q13SumOfOdd {

	public static void main(String[] args) {
		double sum=0;
		int a[]= {2,3,6,8,7,11,19,16,77};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				sum=sum+a[i];
		}
		System.out.println("odd :"+sum);
	}
}
