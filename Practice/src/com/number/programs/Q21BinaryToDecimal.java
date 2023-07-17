package com.number.programs;
import java.util.Scanner;
public class Q21BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IN Decimal ");
		int a=sc.nextInt();
		String b="";
		int t=a;
		while(t>0) {
			int r=t%2;
			t=t/2;
			b=r+b;
		}
		System.out.println("Binary conversion of: " +a + "is : "+b);
	}
}
