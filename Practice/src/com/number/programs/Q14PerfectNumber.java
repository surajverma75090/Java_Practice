package com.number.programs;
import java.util.*;
public class Q14PerfectNumber {

	/*
	perfect number is equal to sum of is divisors or factors expect itself e.g.6=1+2+3
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int sum=0;
		for (int i=1;i<n;i++) {   //i<n
			if(n%i==0)
				sum =sum+i;
		}
		if(sum== n)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
