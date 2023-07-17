package com.string.program;
import java.util.*;
public class Q29SpcialWordPrint {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String ");
		String s =sc.nextLine();
		String w="";
		s+=" ";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				char f =w.charAt(0);
				char l=w.charAt(w.length()-1);
				if(Character.toUpperCase(l)==Character.toUpperCase(f))
					System.out.println(w);
				w="";
			}
				
		}
	}
}
