package com.number.programs;

import java.util.Scanner;
public class Q10ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
//		for(int i=1;i<=a;i++) {
//			System.out.println(i);
		
		for(int i=a;i>=1;i--) {
			System.out.println(i);
		}
	}
	
}
