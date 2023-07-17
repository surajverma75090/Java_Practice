package com.array.program;

public class Q31CountOFCharRendom {

	public static void main(String[] args) {
		char a[]= {'A','A','Z','a','h','u','j','z'};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if((a[i]=='A' || a[i]=='Z')) {
				count++;
				//System.out.println(a[i]);
				System.out.println(count);
				
			}
			//if(a[i]=='A')
				//count++;
		//	System.out.println(a[i]);
		}
	}
}
