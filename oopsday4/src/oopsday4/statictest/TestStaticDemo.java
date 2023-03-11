package oopsday4.statictest;

public class TestStaticDemo {
	public static void main(String[] args) {
		
//		StaticDemo d = new StaticDemo();
//		
//		StaticDemo d1 = new StaticDemo();
//		
//		d.a=20;
//		d.b=30;
//		
//		System.out.println(d1.a);//0
//		System.out.println(d1.b);//30
//		d1.b++;
//		System.out.println(d.b);//31
		
		System.out.println(StaticDemo.b); //0 static means shared. static variable is shared and can  access with object and its class name
		StaticDemo d = new StaticDemo();
		System.out.println(d.b);//1
		StaticDemo d3 = new StaticDemo();
		System.out.println(StaticDemo.b);//2
		StaticDemo d1 = new StaticDemo();
		System.out.println(d1.b);//3
		
		StaticDemo d2 = new StaticDemo();
		System.out.println(d2.b);//4
		
		System.out.println(StaticDemo.b);//4
		
		
	}

}
