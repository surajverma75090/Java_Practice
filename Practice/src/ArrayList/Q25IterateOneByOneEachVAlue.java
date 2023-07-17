package ArrayList;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
public class Q25IterateOneByOneEachVAlue {
 public static void main(String[] args) {
	
	 List l=new ArrayList();
	 l.add("1");
	 l.add("2");
	 l.add("3");
	// System.out.println(l);
	 
	 /* 
	  how to iterate each value through iterate() method
	  */
	 // 1.BY iterator
	//System.out.println(ls);
	//System.out.println(ls.hasNext());

	 Iterator ls = l.iterator();
	while(ls.hasNext())
	{
		System.out.println(ls.next());
	}
	
	// 2.BY listIterator
	
	ListIterator b =l.listIterator();
	while(b.hasNext()) {
		System.out.println(b.next());
	}
	
	
	
	
	
	
	
	
	
}
}
