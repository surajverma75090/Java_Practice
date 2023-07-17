package ArrayList;
import java.util.*;
public class Q11ReverseElements {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("suraj");
		a.add("verma");
		a.add("s");
		a.add("raj");
		System.out.println(a);
		System.out.println(a.toString());
		Collections.reverse(a);
		System.out.println(a);
	}
}
