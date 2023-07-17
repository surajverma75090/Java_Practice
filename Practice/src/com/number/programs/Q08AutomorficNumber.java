package com.number.programs;
import java.util.*;
public class Q08AutomorficNumber {
//which contained in the last digit of its square e.g.25 in 625
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		int m =n;
		int flag=0;
		int q=n*n;
		while(n!=0){
			int d =n%10;
			int d1=q%10;
			if(d!=d1) flag =1;
			n=n/10;
			q=q/10;
		}
		if(flag==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}

