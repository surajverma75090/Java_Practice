package com.array.program;

public class AllEvenNoFollowedByOddNo {

	public static void main(String[] args) {
		int a[]= {1,3,5,2,7,88,6,16,44,10};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			//	System.out.print("Even");
				System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1)
			//	System.out.print("Odd");
				System.out.print(a[i]+" ");
		}
	}
}
