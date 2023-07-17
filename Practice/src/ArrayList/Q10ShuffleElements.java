package ArrayList;
import java.util.*;
public class Q10ShuffleElements {

	public static void main(String[] args) {
		List<String> a =new ArrayList<String>();
		a.add("suraj");
		a.add("1");
		a.add("erma");
		a.add("verr");
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
	}
}
