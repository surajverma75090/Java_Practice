package AshokItString;

public class Q03ReverseString {
	
	public static void main(String[] args) {
	String input ="java code";
	System.out.println("original string ::" +input);
	
	String output = "";
	String[] words = input.split(" ");
	for(String word :words) {
		String revWord ="";
		//reverse word
		for(int i =word.length()-1;i>=0;i--) {
			revWord = revWord + word.charAt(i);
			
		}
		output = output+revWord + " ";
	}
	System.out.println("Revrse String: "+output);
}
	
}
