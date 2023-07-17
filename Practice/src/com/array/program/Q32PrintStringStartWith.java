package com.array.program;

public class Q32PrintStringStartWith {

	public static void main(String[] args) {
		
		String a[]= {"Suraj","verma"};
		for(int i=0;i<a.length;i++) {
			if(a[i].startsWith("S"))
				System.out.println(a[i]);
		}
	}
}
