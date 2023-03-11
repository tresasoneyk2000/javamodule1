package oopsday4.polymorphism;

public class Shape {

	public double area() {		return 0.0;	}

	@Override
	public String toString() {
		return "Shape [area()=" + area() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}	
	
	
}
