package com.number.programs;

import java.util.*;
public class Q05DuckNumber {
// A number which have Zeroes present in it i.e.202,403,280
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		int m=n;
		int count =0;
		while(n!=0) {
			int d =n%10;
			if(d==0) count++;
			n=n/10;
		}
		if(count>0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
