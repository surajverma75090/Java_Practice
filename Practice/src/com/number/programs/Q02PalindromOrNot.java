package com.number.programs;

import java.util.Scanner;
public class Q02PalindromOrNot {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();
	
	int m=n;
	int sum=0;
	while(n!=0) {
		int d=n%10;
		sum=sum*10+d;
		n=n/10;
	}
	if (sum==m)
		System.out.println("yes");
	
	else 
		System.out.println("no");
	
	
	}
	
	
}
