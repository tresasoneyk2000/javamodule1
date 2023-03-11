package oopsday2_shapes;

public class RectangleFactory {
public static void main(String[] args) {
	ShapeIface shape= new Rectangle(5,10);
	shape.area();
	//shape.length();
}
}
