package practice_variable;

public class classVriableExample {

	int a=30;  //instant variable

	static int b=20;  //static or class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 classVriableExample obj = new  classVriableExample();
		 System.out.println(obj.a);
		 
		 int c=10;  //local variable
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(c+b);
		 System.out.println(b-c);
		
	}

}
