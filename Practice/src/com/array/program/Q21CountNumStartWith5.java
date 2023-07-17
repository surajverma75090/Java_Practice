package com.array.program;

public class Q21CountNumStartWith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {51,2,53,4,5,6,77,8};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%10==5)
				count++;
		}
		System.out.println(count);
	}

}
