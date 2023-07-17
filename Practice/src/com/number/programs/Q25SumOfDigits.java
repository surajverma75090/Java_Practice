package com.number.programs;
import java.util.*;
public class Q25SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Numbers");
		int n =sc.nextInt();
		int r,sum =0;
		while(n>0) {
		 r=n%10;
		 sum =sum+r;
		 n=n/10;
		}
		System.out.println(sum);
	}
}
