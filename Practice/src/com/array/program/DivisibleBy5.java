package com.array.program;

public class DivisibleBy5 {

	public static void main(String[] args) {
		int a[]= {10,21,2,40,5,55,1050};
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0)
				System.out.println(a[i]);
		}
	}
}
