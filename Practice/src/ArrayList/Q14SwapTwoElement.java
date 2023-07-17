package ArrayList;
import java.util.*;
public class Q14SwapTwoElement {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		//System.out.println(a);
		for(String b:a) {
			System.out.println(b);
		}
		System.out.println("after swap");
		Collections.swap(a,4,2);
		for(String c:a) {
			System.out.println(c);
		}
	}
}
