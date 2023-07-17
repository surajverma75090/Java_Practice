package com.pra.pattern;

import java.util.Scanner;
public class Q10RightUpDawn {

	public static void main(String[] args) {
		
		int a=5;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the pattern you want");
		//int i =sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=a;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for(int j=i;j<=a;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("3");
			}
			System.out.println();
		}
	}
}

