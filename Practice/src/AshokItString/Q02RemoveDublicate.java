package AshokItString;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q02RemoveDublicate {

	public static void main(String[] args) {
		
		String a="programming";
		
		//Approach-1 byDisting method available in java 8 
		StringBuilder s =new StringBuilder();
		a.chars().distinct().forEach(c ->s.append((char)c));
		System.out.println(s);
		
		//Approach 2- String Class (indexof method)
		StringBuilder s1 = new StringBuilder();
		for(int i=0;i<a.length();i++) {
			char ch =a.charAt(i);
			int idx =a.indexOf(ch,i+1);
			if(idx==-1) {
				s1.append(ch);
			}
		}
		System.out.println(s1);
		
		//Approach -3 toCharArray MEthod
		char[]arr =a.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i =0;i<arr.length;i++) {
			boolean repated=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repated =true;
					break;
					}
				}
			if(!repated) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);
		
		//Apprach -4 set interface
		
		StringBuilder sb4 =new StringBuilder();
		Set<Character> set =new LinkedHashSet();
		for(int i =0;i<a.length();i++) {
			set.add(a.charAt(i));
			}
		for(Character c :set) {
			sb4.append(c);
		}
		System.out.println(sb4);
		
	}
}
