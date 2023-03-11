package another;
import source.Parent;
public class Subclass extends Parent{
	public Subclass() {
		// TODO Auto-generated constructor 
		//System.out.println(a);// private cannot be access by child class in another package
		//System.out.println(b);// default b cannot access by child class in another package
		
		System.out.println(c);
		System.out.println(d);
	}

}
