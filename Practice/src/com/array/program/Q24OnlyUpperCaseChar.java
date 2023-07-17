package com.array.program;

public class Q24OnlyUpperCaseChar {
public static void main(String[] args) {
	char a[]= {'a','v','z','j','s','e','Z'};
	for(int i=0;i<a.length;i++) {
		if(Character.isUpperCase(a[i]))
		System.out.println(a[i]+" "+(int)a[i]);
	}
}
}
