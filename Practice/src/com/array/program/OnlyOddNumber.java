package com.array.program;

public class OnlyOddNumber {

	public static void main(String[] args) {
		int [] arr= {5,12,4,21,8,33,5,9,12,0,44};
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==1)
			System.out.println(arr[i]);
		}
	}
}
