package com.array.program;

public class Q14SumOf2Digit {

	public static void main(String[] args) {
		double sum =0;
		int a[]= {1,2,44,12,6,67,66,88};
		for(int i=0;i<a.length;i++) {
			if(a[i]>9 && a[i]<100)
				sum =sum+a[i];
				System.out.println(sum);
		}
	}
}
