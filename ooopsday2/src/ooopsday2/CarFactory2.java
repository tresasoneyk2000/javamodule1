package ooopsday2;

public class CarFactory2 {
	public static void main(String [] args) {
		//CarIface car= new CarIface(); cannnot make object of interface
		//CarIface car;// not refering to any objects
		CarIface c= new Car(5000,500,0,false);// inteface comes on right side
		c.start();
		c.hank();
		c.move();
		c.stop();
		System.out.println(c);
		
	}

}
