package com.array.program;

public class Q28UpperCaseChar {

	public static void main(String[] args) {
		char a []= {'N','O','2','6','S'};
		String s=" ";
		for(int i=0;i<a.length;i++) {
			if(Character.isUpperCase(a[i]))
				s=s+a[i];
		}
		System.out.println(s);
	}
}
