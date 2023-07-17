package Set;
import java.util.*;
public class Q02IterateEachValueByMethods {

	public static void main(String[] args) {
		Set s =new HashSet();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		System.out.println(s);
		Iterator se =s.iterator();
		while(se.hasNext()) {					//each value iterate
			System.out.println(se.next());
		}
	}
}
