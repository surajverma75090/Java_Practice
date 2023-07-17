package RamdomProgramming;

import java.util.Scanner;
class Area {
	private float breath,width;
	void setDim() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter breath");
	float breath =sc.nextInt();
	
	
	System.out.println("enter width");
	float width =sc.nextInt();
	
	float d = breath*width;
	System.out.println("area :"+d);
	
	
	}
}

	class Q1CalArea{
	public static void main(String[] args) {
		Area c =new Area();
		c.setDim();
	}	

}