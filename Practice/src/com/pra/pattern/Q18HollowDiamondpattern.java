package com.pra.pattern;

public class Q18HollowDiamondpattern {

	public static void main(String[] args) {
		int i,j,a=5;
		for(i=1;i<a;i++) {      //for removing 33||33 i<=a ;i<a
			for(j=i;j<=a;j++) {
				System.out.print("  ");
			}
			for(j=1;j<i;j++) {
				if(j==1)
				System.out.print("1 ");
				else
					System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				if(j==i)
				System.out.print("2 ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
		
		for(i=1;i<=a;i++) {
			for(j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<a;j++) {
				if (j==i)
				System.out.print("3 ");
				else
					System.out.print("  ");
			}
			for(j=i;j<=a;j++) {
				if(j==a)
				System.out.print("4 ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
	}
}
