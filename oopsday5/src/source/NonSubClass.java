package source;

public class NonSubClass {
	public NonSubClass() {
		// TODO Auto-generated constructor stub
		Parent p = new Parent();
		//System.out.println(p.a);// private cannot be access by non sub class in same package
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);
		}

}
