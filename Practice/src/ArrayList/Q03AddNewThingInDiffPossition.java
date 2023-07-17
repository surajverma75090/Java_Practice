package ArrayList;
import java.util.*;
public class Q03AddNewThingInDiffPossition {

	public static void main(String[] agrs) {
		List<String> a =new ArrayList<String>();
		a.add("Suraj");
		a.add("verma");
		a.add("indore");
		System.out.println(a);
		//for(String b:a) {
			//System.out.print(b+" ");
			a.add(0,"Name:");
			a.add(4,"cdac");
			System.out.println(a);
			
		
	}
}
