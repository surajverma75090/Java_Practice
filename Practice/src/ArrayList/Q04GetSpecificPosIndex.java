package ArrayList;
import java.util.*;
public class Q04GetSpecificPosIndex {

	public static void main(String[] args) {
		
		List<String> a =new  ArrayList<String>();
		a.add("Suraj");
		a.add("verma");
		a.add("indore");
		a.add("mumbai");
		a.add("jhasi");
		System.out.println(a);
		String b=a.get(0);
		System.out.println(b);
		b=a.get(4);
		System.out.println(b);
	}
}
