package com.array.program;

public class OnlyPossitiveNum {

	public static void main(String[] args) {
		int a[]= {-1,2,6,3434,7,4,-4,-5,44};
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				System.out.println(a[i]);
		}
	}
}
