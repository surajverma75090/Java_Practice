package com.number.programs;


// print all digits of a number xxxxxx on different lines


import java.util.Scanner;
public class Q01PrintSeperatedigitWies{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		
		int m =n;
		while(n!=0) {
			 int d=n%10;
			 System.out.println(d);
			 n=n/10;
		}
		
		
	}
	
}

