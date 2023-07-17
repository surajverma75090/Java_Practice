package com.string.program;
import java.util.*;
public class Q25First2CharOfEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		String w="";
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				System.out.println(w.substring(0,2));
				w="";
			}
			
		}
	}
}
