package com.string.program;
import java.util.Scanner;
public class Q15ChangeChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.next();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			char u=Character.toUpperCase(c);
			if(u=='R');
			count++;
		}
		System.out.println(count);
	}
}
