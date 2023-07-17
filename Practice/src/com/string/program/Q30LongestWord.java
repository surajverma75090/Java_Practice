package com.string.program;
import java.util.*;
public class Q30LongestWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter String");
		String s=sc.nextLine();
		String w="";
		s+=" ";
		String lw="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				if(w.length()>lw.length() )
					lw=w;
					w="";
			}
		}
		System.out.println("Longest word :"+lw);
	}
}
