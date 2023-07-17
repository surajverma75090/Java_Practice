package com.number.programs;
import java.util.Scanner;

public class Q13CompositeNumber {

	// Composite no. is a no which has more than one factor(excl.1,n).e.g. 8=2,4=2 factors
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt(); 
		
		int count =0;					//init
		for(int i=1; i<=n;i++) {
			if(n%i==0)
				count++;  			// logic
		}
		if(count>3)					//check
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
