package com.string.program;

import java.util.Scanner;

public class Q34DeleteWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		String w="";
		s +=" ";
		String ns ="";
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				if(!w.equals("RED"))
					ns=ns+w+" ";
				
				//System.out.println(w.substring(0,2));
				w="";
			}
		}
		System.out.println(ns);
	}
}
