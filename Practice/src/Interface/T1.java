package Interface;

interface T1 {
void show();
}
	class Test implements T1
	{
		public  void show () {
			System.out.println("1");
		}
		public static void main(String[] args) {
			Test t =new Test();
			t.show();
	
		}
	}
