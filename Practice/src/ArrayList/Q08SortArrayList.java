package ArrayList;
import java.util.*;
public class Q08SortArrayList {

	public static void main(String[] args) {
		
		List<String> a= new ArrayList<String>();
		a.add("suraj");
		a.add("verma");
		a.add("cdac");
		a.add("indore");
		a.add("mumbsi");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}
}
