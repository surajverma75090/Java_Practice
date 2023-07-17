package RamdomProgramming;
import java.util.Scanner;

class Ar{
	double length,breath;
	
	void aim() {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter length:");
		length = sc.nextInt();
		
		System.out.print("Enter breath:");
		breath = sc.nextInt();
		
		double c =length*breath;
		System.out.println(c);
	}
}
      class Q2Area {
	public static void main(String[] args) {
		Ar a=new Ar();
		a.aim();
	}
}
