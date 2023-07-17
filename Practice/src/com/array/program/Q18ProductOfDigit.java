package com.array.program;

public class Q18ProductOfDigit {
 public static void main(String[] args) {
	 double p=1;
	int a[]= {2,1,2,11,12,23,45};
	for(int i =0;i<a.length;i++) {
		if(a[i]>9 && a[i]<100)
			p=p*a[i];
			System.out.println(p);
	}
	
	
}
}
