package com.string.program;
import java.util.*;
public class Q11ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		int l=s.length();
		String rev=" ";
		for(int i=l-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
