package com.pra.pattern;

public class Q07HillPattern {

	public static void main(String[] args) {
		int i,j,a=5;
		for(i=1;i<=a;i++) {
			for(j=i;j<=a;j++) {
			System.out.print("  ");
		}
		for(j=1;j<i;j++) {                             //j!=i for removing **
			System.out.print("* ");
		}
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
			System.out.println();
		}
	
System.out.println();
		
	//	int i,j,a=5;
		for(i=1;i<=a;i++) {
			for(j=i;j<=a;j++) {
				System.out.print("* ");
			}
			
			for(j=1;j<i;j++){
				System.out.print("1 ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("2 ");
			}
			System.out.println();
		}
		
	}
}
 