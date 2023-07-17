
package com.pra.pattern;

public class Q05RightSidedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,a =5;
		
		for(i=1;i<=a;i++) {
			for(j=i;j<=a;j++) {
				System.out.print("y "); // this is basic dereasing traingle
			}
			for(j=1;j<=i;j++) {// cjanges on j=i
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
