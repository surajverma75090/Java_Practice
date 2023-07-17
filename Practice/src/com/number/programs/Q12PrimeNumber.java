package com.number.programs;
import java.util.Scanner;
public class Q12PrimeNumber {

	//prime number is a number divisible bt 1 and itself e.g 5 has factor 1,5
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int count =0;      //init
		for(int i =1;i<=n;i++) {
		if(n%i==0)	
			count++;					//logic
		System.out.println(n);
		}
		if(count==2)						//check
		System.out.println(n+ "yes prime hai ");
		else
			System.out.println("no");
	}
}
