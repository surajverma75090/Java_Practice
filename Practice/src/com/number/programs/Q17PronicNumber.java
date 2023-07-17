package com.number.programs;
import java.util.*;
public class Q17PronicNumber {

	// pronic number is the product of two consecutive integers,n(n+1).e.g. 56 = 7*8
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		int fact =0;   //init
		
		for(int i =1;i<=n;i++) {
			if(n%i==0)
				if (i*(i+1) == n)   //logic
					fact = i;
		}
		if(fact!=0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
