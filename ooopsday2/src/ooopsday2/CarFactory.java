package ooopsday2;

public class CarFactory {
	public static void main(String[] args) {
		
	Car car= new Car(5000,500,0,false);
Car c=new Car();
	System.out.println(car);
	car.start();
	car.move();
	car.hank();
	car.stop();
	
	System.out.println(car);
	

}
}