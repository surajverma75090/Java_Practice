package com.string.program;
import java.util.*;

public class Q07CountUpperCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isUpperCase(c))
				count++;
		}
		System.out.println(count+ " : UpperCase");
	}
}
