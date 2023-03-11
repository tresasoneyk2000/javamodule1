package oopsday4.inheritence;

public class B extends A {// A parent B child
	B()
	{
		//System.out.println(x+y);
	//	System.out.println(a);// cannot access by child class because the data mmber a is private
		super(10,20);
		
	}
}
