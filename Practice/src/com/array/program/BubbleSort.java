package com.array.program;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		
		int []a={12,55,11,13,34};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for (int j=0; j<a.length-1;j++) {
				if(a[j] > a[j+1]) {
					 temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
