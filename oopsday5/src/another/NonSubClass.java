package another;
import source.Parent;

public class NonSubClass {
	public NonSubClass() {
		Parent p=new Parent();
		
		System.out.println(p.d);// non sub class in another class can access only public of parent
		
	}
	

}
