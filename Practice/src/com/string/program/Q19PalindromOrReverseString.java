package com.string.program;
import java.util.*;
public class Q19PalindromOrReverseString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter String");
	String s =sc.nextLine();
	String rev ="";
	for(int i=0;i<s.length();i++) {
	char c= s.charAt(i);
	rev =c+rev;
	}
	if(s.equalsIgnoreCase(rev))
		System.out.print("Yes it is");
	else 
		System.out.println("No it is not");
}
}
