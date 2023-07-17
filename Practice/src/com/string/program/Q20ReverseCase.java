package com.string.program;
import java.util.*;
public class Q20ReverseCase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		 String r="";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isUpperCase(c))
				r=r+Character.toLowerCase(c);
			else
				r=r+Character.toUpperCase(c);
		}
		System.out.print(r);
	}
}
