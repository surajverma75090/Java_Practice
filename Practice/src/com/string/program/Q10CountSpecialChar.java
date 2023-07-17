package com.string.program;
import java.util.Scanner;
public class Q10CountSpecialChar {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		int count=0;
		for(int i =0;i<s.length();i++) {
			char c= s.charAt(i);
			if(c=='R' ||c=='r' ||c=='a'|| c=='i'||c=='o' ||c=='s')
				count++;
			//System.out.print((char)c);
		}
		System.out.println(count);
	}
	
}
