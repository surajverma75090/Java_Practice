package com.pra.pattern;

public class Q9UpDown {

	public static void main(String[] args) {
		int i ,j,a=5;
		for(i=1;i<a;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		for(i=1;i<=a;i++) {
			for(j=i;j<=a;j++) {
				System.out.print("2");
			}
			System.out.println();
		}
		
	}
}
