package ArrayList;
import java.util.*;
public class Q27ArrayListConstructor {
public static void main(String[] args) {
	
	
	//1st constructor
	ArrayList a =new ArrayList();
	a.add("Suraj");
	a.add("MOOn");
	 System.out.println(a);
	 
	 //2nd contructor
	 
	 ArrayList b =new ArrayList(2);
	 b.add("2");
	 b.add("3");
	 b.add("3");
	 System.out.println(b);
	 
	 // 3rd constructor {collection c}
	 ArrayList c =new ArrayList(b);
	 System.out.println(c);
	 
}
	
}
