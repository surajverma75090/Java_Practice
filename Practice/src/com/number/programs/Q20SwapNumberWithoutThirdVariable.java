package com.number.programs;

import java.util.*;
public class Q20SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("First number");
		int n = sc.nextInt();
		System.out.println("second number");
		int m = sc.nextInt();
		
		n=n+m;
		m=n-m;
		n=n-m;
		
		
		System.out.println("Now" + n);
		System.out.println("than"+m);
	}
}
