package com.string.program;
import java.util.*;
public class Q27EndingWithSpecialChar {
    public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter String");
	  String s =sc.nextLine();
	  String w ="";
	  s+=" ";
	  for(int i=0;i<s.length();i++) {
		  char c =s.charAt(i);
		  if(c!=' ')
			  w += c;
		  else {
			  if(w.endsWith("aj"))
				  System.out.println(w);
			  w=" ";
		  }
	  }
	
}
}
