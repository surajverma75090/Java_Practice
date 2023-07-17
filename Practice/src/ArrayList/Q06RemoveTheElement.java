package ArrayList;
import java.util.*;
public class Q06RemoveTheElement {

	public static void main(String[] args) {
		List<String> a =new ArrayList<String>();
		a.add("Suraj");
		a.add("verma");
		a.add("cdac");
		a.add("mumbai");
		System.out.println(a);
		String b =a.remove(3);
		System.out.println(a);
	}
}
