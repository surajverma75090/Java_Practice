package com.number.programs;
//krishna murthy/special number ,sum of factorial of digits is equal to the number e.g.145=1!+4!+5!
import java.util.*;
public class Q09KmOrSpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();
		
		int m=n;
		int sum =0;
		while(n!=0) {
			int d =n%10;
			int fact =1;
			for(int i =1;i<=d;i++)
				fact = fact*i;// fact =1*2*3...d
			
			n=n/10;
		}
		if(sum==m)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
