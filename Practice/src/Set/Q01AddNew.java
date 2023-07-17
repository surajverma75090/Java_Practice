package Set;
import java.util.HashSet;
import java.util.Set;

public class Q01AddNew {

	public static void main(String[] args) {
		 Set s= new HashSet();
		 s.add("suraj");
		 s.add("verma");
		 s.add("cdac");
		 s.add("raj");
		 s.add("4");
		 s.add("suraj");       //we can't stored dublicate value
		 s.add("null");
		 s.add("null");       // can't stored more than one null values
		 System.out.println(s);
	}
}
