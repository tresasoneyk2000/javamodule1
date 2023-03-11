package oopsday4.inheritence;

public class A {
	int x;
	int y;
	private int a;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	private int b;// cannot access by child class because the data mmber a is private
public A() {
	// TODO Auto-generated constructor stub
	
	System.out.println(a);
}
}
