package com.array.program;

import java.util.Scanner;
public class Q01AddingElementInArray {
	
		public static void main(String[] args) {
			int a[] =new int[5];
			int sum=0;
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter elements in array");
		   for(int i =0;i<a.length;i++) {
			a[i]  = sc.nextInt();
		   }
		   System.out.print("Array Element ");
		   for(int i =0;i<a.length;i++) {
				//a[i]  = sc.nextInt();
			   System.out.print(a[i]+" ");
			   sum=a[i]+sum;
			   }
		   System.out.print("\nAdding of two element array "+sum);
		}
}
