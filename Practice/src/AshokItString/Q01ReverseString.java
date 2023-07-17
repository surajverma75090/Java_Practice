package AshokItString;

public class Q01ReverseString {

	public static void main(String [] args) {
		
		String a ="suraj";
		
		//Approach-1
		char[] b=a.toCharArray();
		for(int i =b.length-1;i>=0;i--) {
			System.out.print(b[i]);
		}
		System.out.println();
		
		
		// Approach -2
		for(int i =a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println("");
		
		//Approach-3
		
		StringBuffer sb =new StringBuffer(a);
		System.out.print(sb.reverse());
		System.out.println();
		
		
		//Approach -4
		
		StringBuilder s =new StringBuilder(a);
		System.out.print(s.reverse());
		
		
		
		
		
		
	}
	
	}