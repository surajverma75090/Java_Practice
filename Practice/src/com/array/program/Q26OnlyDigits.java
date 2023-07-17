package com.array.program;

public class Q26OnlyDigits {
	public static void main(String[] args) {
		char a[]= {'1','6','z','j','s','e','Z'};
		for(int i=0;i<a.length;i++) {
			if(Character.isDigit(a[i]))
			System.out.println(a[i]+" "+(int)a[i]);
		}
	}
}
