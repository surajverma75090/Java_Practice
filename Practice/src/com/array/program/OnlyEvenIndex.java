package com.array.program;

public class OnlyEvenIndex {

	public static void main(String[] args) {
		int a[]= {1,23,3,45,6,3,26,6,3,9};
		for(int i =0;i<a.length;i++) {
			if(i%2==0)
			System.out.println(a[i]);
		}
	}
	
}
