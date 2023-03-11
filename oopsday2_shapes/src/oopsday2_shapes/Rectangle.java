package oopsday2_shapes;

public class Rectangle implements ShapeIface {
	
	private double length;
	private double breadth;
	//private double 

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle="+ length*breadth);

	}
	
	public void length() {
		System.out.println(length);
	}
public Rectangle() {}
	@Override
public String toString() {
	return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
}
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

}
