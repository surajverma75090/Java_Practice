package ArrayList;
import java.util.*;
public class Q17EmptyORNot {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		System.out.println(a);
		a.removeAll(a);
		System.out.println("After remove"+a);
		a.isEmpty();
		System.out.println("yes"+a);
	}
}
