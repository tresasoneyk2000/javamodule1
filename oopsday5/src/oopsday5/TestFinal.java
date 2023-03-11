package oopsday5;

public class TestFinal {
	int a=b;// forward reference: trying to acccess b by a which is not defined
	static int b=10;
	final double pie=3.14;// final is compile time constant cannot change value we can add public 
	
	final class A{// final class A cant inherit its property so it cant make its child
		final void m() {};
		}
	
	
	public TestFinal() {
		System.out.println(3.14);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	;

	}

}
