package com.string.program;
import java.util.Scanner;
public class Q03UpperCaseOnly {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		for(int i=0;i < s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				System.out.print(c);
		}
	}
}
