package com.array.program;

public class Q33PrintStringEndWith {
public static void main(String[] args) {
	String []a= {"Aish","suraj","Verma"};
	for(int i =0;i<a.length;i++) {
		if(a[i].endsWith("ma"))
			System.out.println(a[i]);
	}
}
}
