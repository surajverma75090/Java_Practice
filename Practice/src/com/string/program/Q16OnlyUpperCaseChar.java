package com.string.program;
import java.util.* ;
public class Q16OnlyUpperCaseChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		String sn="";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isUpperCase(c))
				sn=sn+c;
		}
		System.out.print(sn);
	}
}
