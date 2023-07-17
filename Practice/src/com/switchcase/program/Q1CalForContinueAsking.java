package com.switchcase.program;

import java.util.Scanner;
public class Q1CalForContinueAsking {

	public static void main(String [] args) {
		
		String yn;
		do {                                                                            
		Scanner sc =new Scanner(System.in);           
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("Choose any Operator : + - / *");
		String c = sc.next();
		int res;
		switch(c) {
			
		case"+":res=a+b;
				System.out.println("Addition is :" +res);
				break;
				
		case"-":res=a-b;
		System.out.println("Subtraction is :" +res);
		break;
		
		case"*":res=a*b;
		System.out.println("Multiplication is :" +res);
		break;
		
		case"/":res=a/b;
		System.out.println("Division is :" +res);
		break;
		
		default: System.out.println("Invalid Input");
		break;
		}
				System.out.println("Do u want to Continue (Press y for yes and n for No)");
				yn=sc.next();
		}while(yn.equals("y") || yn.equals("Y")) ;
		
		
	}
}
