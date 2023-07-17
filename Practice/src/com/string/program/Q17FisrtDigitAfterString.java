package com.string.program;
import java.util.*;
public class Q17FisrtDigitAfterString {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String d="",r="";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isDigit(c))
				d=d+c;
			else
				r=r+c;
		}
		String sen=d+r;
		System.out.println(sen);
	}
}
