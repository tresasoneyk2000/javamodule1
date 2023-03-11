package oopsday4.statictest;

public class StaticDemo2 {
	static int a;
	void method() {
		System.out.println("from main"+ a);
		method1();
	}
	static void method1() {
		System.out.println("from static" + a);// static method can access only static data members
		//method();// cannot access because it is non static
	}


}
