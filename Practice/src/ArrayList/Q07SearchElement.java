package ArrayList;
import java.util.*;
public class Q07SearchElement {

	public static void main(String[] args) {
		
		List<String> a =new ArrayList<String>();
		a.add("suraj");
		a.add("verma");
		a.add("cdac");
		a.add("nashik");
		System.out.println(a);
		if(a.contains("suraj")) {
			System.out.println("yes found");
		}
		else {
			System.out.println("not");
		}
	}
}
