package ArrayList;
import java.util.*;
public class Q13CampareTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("red");
		a.add("blue");
		a.add("white");
		a.add("black");
		a.add("sky");

		ArrayList<String> b=new ArrayList<String>();
		b.add("red");
		b.add("blue");
		b.add("grey");
		b.add("black");
		b.add("sky");
		b.add("skyy");
		
			
		ArrayList<String> c=new ArrayList<String>();
		for(String d:a)
			c.add(b.contains(d) ? "yes" :"no");
		System.out.println(c);
		
	}
}
