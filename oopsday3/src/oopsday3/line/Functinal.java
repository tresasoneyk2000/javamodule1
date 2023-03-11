package oopsday3.line;

public class Functinal implements DrawIface {
	
	Point []p1=new Point[2];
	//Point p2=new Point(10,20);
	
	public Functinal() {
		
		// TODO Auto-generated constructor stub
	}
	public void draw(Point p1, Point p2) {
//		if(p2.getX()>p1.getX() && p2.getY()>p1.getX()) {
////			int i=p2.getX()-p1.getY();
////			int j=p2.getY()-p1.getY();
////			for()
//			System.out.println("*");
//			int j=p1.getX()+1;
//
//	}
		System.out.println(p1.getX());
		System.out.println("********");
		
}
	public Functinal(Point[] p1) {
		super();
		this.p1 = p1;
	}
	

}
