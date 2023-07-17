package ArrayList;

import java.util.*;
public class Q26ListIteratorHasPrevious {

	public static void main(String[] args) {
		 List l = new ArrayList();
		 l.add("1");
		 l.add("2");
		 l.add("3");
		 l.add("4");
		 
		 ListIterator a=l.listIterator();
		 while(a.hasNext()) {
			 System.out.println(a.next());
		 }
		 System.out.println("_________________");
		 while(a.hasPrevious()) {
			 System.out.println(a.previous());
		 }
		 
	}
}
