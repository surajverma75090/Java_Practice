package com.number.programs;
import java.util.*;
public class Q18FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter Number");
		int n =sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
		}
//		if()
//			System.out.println("yes");
//		else
//			System.out.println("no");
	}
}
