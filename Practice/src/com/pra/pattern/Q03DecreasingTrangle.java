package com.pra.pattern;

public class Q03DecreasingTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 5;
		int i,j;
		for(i=1;i<=a;i++) {
			for(j=i;j<=a;j++ ) {//changes only on the j=i 
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
