package ArrayList;
import java.util.ArrayList;
public class Q28ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList a =new ArrayList();
		
		// 1st method =add(),in this we dont give index value
		//beacoz arraylist is index based ds
		a.add("1");
		a.add("2");
		a.add(1);
		System.out.println(a);
		
		//2nd =addAll(); we add one to another
		ArrayList b= new ArrayList();
		b.add("sun");
		b.add("2");
		b.add(1);
		
		a.addAll(b);
		System.out.println(a );
		
		// 3rd remove()
		
		b.remove(0);
		System.out.println(b);
		
		// 4rth removeAll()
		a.removeAll(b);
		System.out.println(a);
		
		//5.contains=boolean value;
		//6.clear=remove all
		//7.size 
		//8.get=index value= return value
		//9.set =value set 
		//10.indexof =gives index value
		//11.iterator = cursor
		
		
		
		
	}
	
}
