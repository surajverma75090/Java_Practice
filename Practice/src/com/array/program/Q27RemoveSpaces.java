package com.array.program;

public class Q27RemoveSpaces {
	public static void main(String[] args) {
		char a[]= {'1',' ','z','j','s','e','Z'};
		for(int i=0;i<a.length;i++) {
			if(!Character.isSpaceChar(a[i]))
			System.out.print(a[i]);
		}
	}
}
