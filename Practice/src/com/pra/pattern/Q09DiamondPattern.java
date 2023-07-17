package com.pra.pattern;

public class Q09DiamondPattern {

	
	public static void main(String[] args) {
		int i,j,a=5;
		for(i=1;i<a;i++) {      //for removing 33||33 i<=a ;i<a
			for(j=i;j<=a;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("1 ");
			}
			for(j=1;j<i;j++) {
				System.out.print("2 ");
			}
			
			System.out.println();
		}
		
		for(i=1;i<=a;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=a;j++) {
				System.out.print("3 ");
			}
			for(j=i;j<a;j++) {
				System.out.print("4 ");
			}
			
			System.out.println();
		}
	}
}
