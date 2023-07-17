package ArrayList;
import java.util.*;
public class Q15JoinTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("suraj");
		a.add("verma");
		a.add("cdac");
		a.add("indore");
		System.out.println(a);
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("moon");
		b.add("jupiter");
		b.add("sun");
		b.add("uranus");
		System.out.println(b);
		
		ArrayList<String> c =new ArrayList<String>();
		c.addAll(a);
		c.addAll(b);
		System.out.println("New Array :"+c);
		//Collections.sort(c);
		//System.out.println(c);
	}
}
