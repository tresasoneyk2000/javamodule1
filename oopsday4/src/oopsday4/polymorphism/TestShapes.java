package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape t= new Shape();
		System.out.println(t);
		
	//	Rectangle sfc= new Shape(); child class cannot make reference for parent narrowing is not allowed in object case class has ni memory
		Shape s=new Rectangle(10.25,65.75);// s can access only methods and variables which is common to both rectangle and shape
		Rectangle r=new Rectangle(10,65);
		
		double result =s.area();
		result =r.area();
		System.out.println(result);
		 result =s.area();
		 System.out.println(result);
		s= new Circle(35.87);
		result=s.area();
		
		System.out.println(result);
		
		s= new Square(55);
		result=s.area();
		
		System.out.println(result);}

}
