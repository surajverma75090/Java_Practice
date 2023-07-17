package com.switchcase.program;

import java.util.*;
public class Q1Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nmber");
		int n =sc.nextInt();
		
		System.out.println("Enter Second");
		int m = sc.nextInt();
		
		System.out.println(" Choose any ONE OPERATER : + - * / ");
		String o =sc.next();
		int res;
		switch(o) {
		
		       case "+": res=n+m;
		       			System.out.println("Addition is :" + res);
		       			break;
		       			
		       case "-": res=n-m;
		       			System.out.println("Subtraction is :"+ res );
		       			break;
		       			
		       case "*": res=n*m;
		       			System.out.println("Multiplication is :"+ res);
		       			break;
		       			
		       case "/": res= n/m;
		       			System.out.println("Division is :"+ res);
		       			break;
		       			
		       default: System.out.println("Invalid input");
		       			break;
		
		}
	}
}
