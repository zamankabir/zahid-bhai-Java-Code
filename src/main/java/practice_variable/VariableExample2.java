package practice_variable;

public class VariableExample2 {

	int a=40;   //instant variable
	
	static int b=20;   // static/class variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		VariableExample2 obj = new VariableExample2();
		System.out.println(obj.a);
		
		
		int c=80;  //local variable
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(b+c);
	}

}
