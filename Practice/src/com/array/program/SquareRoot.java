package com.array.program;

public class SquareRoot {

	public static void main(String[] args) {
		int a[] = {5,12,4,21,8,2,3,7,9,11};
		for(int i=0;i<a.length;i++) {
			System.out.printf("%.2f\n",Math.sqrt(a[i]));
		}
	}
}
