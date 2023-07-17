package com.array.program;

public class Q15SunOfPositive {

	public static void main(String[] args) {
		double sum =0;
		int a[]= {5,12,4,21,8,2,3,7,9,-11};
		
		for(int i =0;i<a.length;i++) {
			if(a[i]>0)
				sum=sum+a[i];
				System.out.println(sum);
		}
	}
}
