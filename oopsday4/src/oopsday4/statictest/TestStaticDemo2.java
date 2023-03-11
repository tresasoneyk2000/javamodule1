package oopsday4.statictest;

public class TestStaticDemo2 {
	int i=10;

	public static void main(String[] args) {
		
		StaticDemo2 d1= new StaticDemo2();
		
		d1.method();// instance methods can access only through object
		
		StaticDemo2.method1();// static methods can access by class name and object
		//System.out.println(i );// static methods can access by class name and object
		
		//double r=Math.PI)@)
	}
}
