package com.pra.pattern;

public class Q5RightSidedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i ,j,a=5;
		for(i=1;i<=a;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
