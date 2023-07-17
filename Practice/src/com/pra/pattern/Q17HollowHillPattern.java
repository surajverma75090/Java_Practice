package com.pra.pattern;

public class Q17HollowHillPattern {

	public static void main(String[] args) {
		int i,j,a=5;
		for(i=1;i<=a;i++) {
			for(j=i;j<=a;j++) {
			System.out.print("  ");
		}
		for(j=1;j<i;j++) {    //j!=i for removing **
			
			if(i==a || j==1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		for(j=1;j<=i;j++) {
			if(i==a || j == i)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
			System.out.println();
		}
}
}