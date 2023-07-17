package com.number.programs;
import java.util.*;
public class Q15AbundantNumber {

	//abundrnt number is sum of factor is greater than the no itself e.g.12 factor 1,2,3,4,6=16>12
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter number");
		int n =sc.nextInt();
		
		int sum=0;
		for (int i=1; i<n;i++) {
			if(n%i==0)
				sum = sum+i;
		}
		if(sum>n)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
