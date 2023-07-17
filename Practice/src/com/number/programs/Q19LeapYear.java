package com.number.programs;

import java.util.*;
public class Q19LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int n =sc.nextInt();
		
		 if(n%4==0) 
		 {
			 if(n%100==0) 
			 {
				 if(n%400==0) 
				 {
					 System.out.println("Leap year");
				 }
				 else 
				 {
					 System.out.println("Not a Leap year");
				 }
			 }
			 else 
			 {
				 System.out.println("Leap year");
			 }
		 }
		 else 
		 {
			 System.out.println("Not a Leap year");
		 }
	}
}
