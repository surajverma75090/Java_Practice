 package com.array.program;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[]= {11,1,23,347,5,77};
		int min; int temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
					
				}
			}
			temp  = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
