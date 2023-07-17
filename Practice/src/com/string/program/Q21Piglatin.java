package com.string.program;
import java.util.*;
public class Q21Piglatin {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s=sc.nextLine();
	String pl="";
	for(int i=0;i<s.length();i++) {
		char c =s.charAt(i);
		char u =Character.toLowerCase(c);
		if(u=='a'|| u=='e'|| u=='i'|| u=='o'||u=='u') {
			if(i==0)
				pl=s+"way";
			else
				pl=s.substring(i)+s.substring(0,i)+"ay";
			break;
		}
	}
	System.out.println(pl);
}
}
