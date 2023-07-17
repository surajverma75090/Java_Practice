package ArrayList;
import java.util.*;
public class Q22RemoveDuplicateArrayList {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("suraj");
		a.add("verma");
		a.add("suraj");
		a.add("aj");
		a.add("rajesh");
		
		System.out.println(a.toString());
		
		Set<String> s =new LinkedHashSet<String>(a);
		System.out.println(s);
		
	}
}
