package ArrayList;

import java.util.*;
public class Q05UpdateSpecificarrayElementAdd {

	public static void main(String[] args) {
		List<String>a=new ArrayList<String>();
		a.add("Suraj");
		a.add("verma");
		a.add("cdac");
		a.add("nashik");
		System.out.println(a);
		String b=a.set(0, "Er");
		System.out.println(a);
		b=a.set(3, "pgdac");
		System.out.println(a);
	}
}
