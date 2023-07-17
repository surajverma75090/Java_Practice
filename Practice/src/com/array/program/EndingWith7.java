package com.array.program;

public class EndingWith7 {
public static void main(String[] args) {
	int a[]= {1,7,347,87,57,0,97};
	for(int i=0;i<a.length;i++) {
		if(a[i]%10==7)
			System.out.println(a[i]);
	}
}
}
