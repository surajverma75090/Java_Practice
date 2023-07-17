package com.array.program;

public class Q30ChangeCaseOfCharecters {
	public static void main(String[] args) {
		char a []={'a','s','S','C','Q','F','L'};
		String s="";
		for(int i=0;i<a.length;i++) {
			if(Character.isUpperCase(a[i]))
				s+=Character.toLowerCase(a[i]);
			else
				s+=Character.toUpperCase(a[i]);
				
		}
		System.out.println(s);
	}
}
