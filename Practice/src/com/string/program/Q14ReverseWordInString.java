package com.string.program;

public class Q14ReverseWordInString {

	public static void main(String[] args) {
		String s="Suraj is here";
		String w = "";
		String a[] = s.split(" ");
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		for(int i=a.length-1;i>=0;i--) {
			w=w+a[i]+" ";
		}
		System.out.println(w);
	}
}
