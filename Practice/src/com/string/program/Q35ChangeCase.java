package com.string.program;

import java.util.Scanner;

public class Q35ChangeCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		String w="";
		s += " ";
		String ns = "";
		int count=0;
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				if(count++%2 == 0)
					ns =ns+w.toUpperCase()+" ";
				else
					ns =ns+w.toLowerCase()+" ";
					w="";
				}
			}
		System.out.println(ns);
	}
}
