package com.string.program;
import java.util.*;
public class Q28WordHaving3CharInSentances {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s =sc.nextLine();
		String w= "";
		s+=" ";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				if(w.length()==3) 
					System.out.println(w);
				w="";
			}
		}
	}
}
