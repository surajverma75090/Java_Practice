package com.pra.pattern;

public class Q16HollowDecreasingTriangle {
	public static void main(String[] args) {
		
	
	int a= 5;
	int i,j;
	for(i=1;i<=a;i++) {
		for(j=i;j<=a;j++ ) {//changes only on the j=i 
			if(i==1||j==i||j==a)
				System.out.print("* ");
			else
			System.out.print("  ");
		}
		System.out.println();
	}
}
}
