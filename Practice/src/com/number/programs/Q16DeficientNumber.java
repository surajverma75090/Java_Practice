package com.number.programs;
import java.util.*;
public class Q16DeficientNumber {

	//Deficient number sum of factors is less than the no.its e.g 21 .factor 1,3,7=11<21
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
		
			int sum = 0;	//init
		for(int i =1;i<n;i++) {				// i < n
			if(n%i==0)
				sum = sum+i;							// sum = sum + i;
		}
		if(sum<n)								// condition
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
