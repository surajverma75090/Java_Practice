package com.number.programs;

import java.util.Scanner;
public class Q20SwapNumberWithThirdVariable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first Number");
		int n = sc.nextInt();
		
		System.out.println("Enter Second Nunber");
		int m = sc.nextInt();
		
		int t=n;
		n=m;
		m=t;
		System.out.println("after swap first number is "+n);
		System.out.println("after swap second number is"+m);
		
		
	}
}
