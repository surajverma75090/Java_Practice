package com.string.program;

public class BubbleSort {

	public static void main(String[] args) {
		
		String []a= {"suraj","aishwarya","divya","salman"};
		String temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					 temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
