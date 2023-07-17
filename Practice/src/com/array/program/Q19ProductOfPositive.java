package com.array.program;

public class Q19ProductOfPositive {

	public static void main(String[] args) {
		
		int a[]= {2,4,3,5,-6,-7,8,-9};
		double p =1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				p=p*a[i];
				System.out.println(p);
		}
	}
}
