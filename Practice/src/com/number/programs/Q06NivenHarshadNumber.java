package com.number.programs;

import java.util.*;
public class Q06NivenHarshadNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		int m =n;
		int sum=0;
		while(n!=0) {
			int d= n%10;
			sum=sum + d;
			n=n/10;
		}
		if(m%sum==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
