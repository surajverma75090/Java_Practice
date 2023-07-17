package ArrayList;
import java.util.*;
public class Q23ConvertArrayToList {

	public static void main(String[] args) {
		
		String a[]= {"Suraj","verma","cdac","indore"};
		System.out.println("Printing array:"+Arrays.toString(a));
		
		List<String> b=new ArrayList<String>();
		for(String i :a) {
			b.add(i);
		}
		System.out.println("Printing LIst"+b);
	}
}
