package com.number.programs;
import java.util.Scanner;
public class Q24BinaryToHexa {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter In Binary");
		int a=sc.nextInt();
		String b="";
		int t=a;
		while(t>0) {
			int r=t%16;
			t=t/16;
			b=r+b;
		}
		System.out.println(b);
	}
}
