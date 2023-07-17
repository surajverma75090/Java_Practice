package RamdomProgramming;

class B{
	private int roll_no;
	int phone_no;
	String add;

	void set(int a ,int b , String c) {
		roll_no =a ;
		phone_no=b;
		add=c;
	}
	
	void get() {
		System.out.println("rollno"+ roll_no);
		System.out.println("phone "+ phone_no);
		System.out.println("address"+ add);
	}
}

        public class Student2 {
		public static void main(String[] args) {
			B st=new B();
			B st1=new B();
			
			System.out.println("student:sam");
			st.set(23, 6776, "thikri ");
			st.get();
			
			System.out.println("student :john");
			st1.set(22, 4330, "dfmsbdf");
			st1.get();
		}
}
