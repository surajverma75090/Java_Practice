package ArrayList;
import java.util.*;
public class Q09CopyOneListIntoAnother {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("suraj");
		a.add("verma");
		a.add("cdac");
		a.add("indore");
		System.out.println(a);
		
		List<String> b =new ArrayList<String>();
		b.add("1");
		b.add("2");
		b.add("3");
		b.add("4");
		System.out.println(b);
		System.out.println("\n");
		Collections.copy(a, b);
		System.out.println("after copy");
		System.out.println(a);
		System.out.println(b);

		Collections.copy(b, a);
		System.out.println("after copy");
		System.out.println(a);
		System.out.println(b);

	}
}
