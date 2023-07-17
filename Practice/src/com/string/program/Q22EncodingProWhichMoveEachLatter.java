package com.string.program;
import java.util.*;
public class Q22EncodingProWhichMoveEachLatter {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter String");
	String s =sc.nextLine();
	String enc="";
	for(int i =0;i<s.length();i++) {
		char c =s.charAt(i);
		if(c=='Y'||c=='Z'||c=='y'||c=='z')
			c -=26;
		c+=2;
		enc=enc+c;
	}
	System.out.println(enc);
}
}
