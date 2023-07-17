package com.array.program;

public class Q34ContainsCharOrString {

	public static void main(String[] args) {
		String a[]= {"Suraj","is","raj"};
		for(int i=0;i<a.length;i++) {
			if(a[i].contains("raj"))
				System.out.println(a[i]);
		}
	}
}
