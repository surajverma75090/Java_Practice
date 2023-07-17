package com.array.program;

public class Q20CountOfEvenNum {
public static void main(String[] args) {
	int a[]= {1,2,4,7,8,9,10};
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0)
			count++;
	}
	System.out.print("Even :" +count);
}
}
