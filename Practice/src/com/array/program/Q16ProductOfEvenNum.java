package com.array.program;

public class Q16ProductOfEvenNum {

	public static void main(String[] args) {
		double prod=1;
		int a[] = {3,4,5,6,7,8,89,};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				prod =prod*a[i];
		}
		System.out.println("Product is:"+prod);
	}
}
