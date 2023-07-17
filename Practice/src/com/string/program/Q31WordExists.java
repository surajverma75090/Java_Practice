package com.string.program;
import java.util.*;
public class Q31WordExists {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter String");
		String s=sc.nextLine();
		String w="";
		s+=" ";
		//String lw="";
		int count =0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				//if(w.equalsIgnoreCase("OR") )
					count++;
					//w="";
			}
		}
		//if(count==0) System.out.print("Not found");
		//else
			System.out.print("no of word"+count);
	}
	}

