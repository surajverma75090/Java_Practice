package com.array.program;

public class Q22FindMaxMinNum {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,77,100};
	int max=a[0],min=a[0];
	for(int i=0;i<a.length;i++) {
		if(max<a[i])
			max=a[i];
		if(min>a[i])
			min=a[i];
	}
	System.out.println(max);
	System.out.println(min);
}
}
