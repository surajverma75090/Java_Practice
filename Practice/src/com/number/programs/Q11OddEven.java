package com.number.programs;
import java.util.Scanner;
public class Q11OddEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nummber");
		int n = sc.nextInt();
		if (n%2==0) 
			System.out.println("No is Even");
		else 
			System.out.println("no is odd");
		
	}
}
