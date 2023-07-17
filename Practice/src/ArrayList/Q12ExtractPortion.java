package ArrayList;
import java.util.*;
public class Q12ExtractPortion {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("suraj");
		a.add("verma");
		a.add("s");
		a.add("raj");
		System.out.println(a);
		List<String> b=a.subList(0, 3);
		System.out.println(b);
	}
}
