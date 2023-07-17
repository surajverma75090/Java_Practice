package com.number.programs;


import java.util.Scanner;
public class Q04OriginalNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		
		int m = n;
		int sum =0,prod=1;
		while(n!=0) {
			int d = n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		if(sum+prod==m)
			System.out.println("yes");//59
		else
			System.out.println("no");
	}
	
}
