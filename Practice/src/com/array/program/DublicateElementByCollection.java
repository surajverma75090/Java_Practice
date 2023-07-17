package com.array.program;

import java.util.HashSet;

public class DublicateElementByCollection {

	public static void main(String[] args) {
		int[] a = {6,5,3,4,5};
		int temp=-1 ;
		
		HashSet<Integer> hs =new HashSet<>();
		for(int i =a.length-1;i>=0;i--) {
			if(hs.contains(a[i])) {
				temp=i;
			}
			else {
				hs.add(a[i]);
			}
		}
		if(temp !=-1) {
			System.out.println("first dublicat element is "+a[temp]);
		}
		else {
			System.out.println("no first dublicate element");
		}
	}
}
