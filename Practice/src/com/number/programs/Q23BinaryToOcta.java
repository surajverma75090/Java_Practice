package com.number.programs;
import java.util.*;
public class Q23BinaryToOcta {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter In Binary");
		int a=sc.nextInt();
		String b="";
		int t=a;
		while(t>0) {
			int r=t%8;
			t=t/8;
			b=r+b;
			}
		System.out.println(b);
	}
}
