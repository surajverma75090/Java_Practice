package com.array.program;

public class Q29UpperCaseWithCountOnly {

	public static void main(String[] args) {
		int count=0;
		char a[]= {'a','b','v','S','F','Z'};
		for(int i =0;i<a.length;i++) {
			if(Character.isUpperCase(a[i])) {
				
				System.out.print(a[i]);
			}
				count++;
		}
		System.out.println(count);
	}
}
