package ArrayList;
import java.util.*;
public class Q24ConvertListToArray {

	public static void main(String[] args) {
		List<String> a =new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		System.out.println(a);
		
		String b[]= a.toArray(new String[a.size()]);
		System.out.println(b);
		System.out.println(Arrays.toString(b));
		
	}
}
