package ArrayList;
import java.util.*;
public class Q21PositionElementOrIndex {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("sun");
		a.add("moon");
		a.add("jupiter");
		a.add("uranus");
		System.out.println(a);
		int b=a.size();
		for(int i=0;i<b;i++)
		System.out.println(a.get(i));
	}
}
