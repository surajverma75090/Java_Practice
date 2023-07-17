package com.array.program;

public class Q17ProductOfOdd {
public static void main(String[] args) {
	double prod=1;
	int a[]= {3,4,5,6,7,8,9,11,12};
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0)
			prod=prod*a[i];
			System.out.println(prod);
	}
}
}
