package com.string.program;

import java.util.Scanner;

public class Q32EndingWIth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		String w="";
		s+=" ";
		int count=0;
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				if(w.endsWith("d"))
				count++;
				w="";
			}
		}
		System.out.println("No of words:"+count);
	}
}
