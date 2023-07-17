package com.number.programs;

import java.util.*;
public class Q07NeonNumber {

	// 9*9=81,9=8+1
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		
		int m=n;
		int sum=0;n=n*n;
		while(n!=0) {
			int d = n%10;
			sum= sum+d;
			n=n/10;
		}
		if(sum==m)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
