package com.number.programs;

import java.util.Scanner;
public class Q12Prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		int temp=0;
		
		for(int i =2;i<=n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(n+"is prime number");
		}
		else {
			System.out.println(n+" is not prime number");
		}
	}
}
