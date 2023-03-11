package source;

public class Subclass extends Parent {
	public Subclass() {
		// TODO Auto-generated constructor stub
		//System.out.println(a);// private cannot be access by child class in same package
		Parent p=new Parent();
	System.out.println(b);
	System.out.println(p.c);
	System.out.println(d);
	}
	

}
