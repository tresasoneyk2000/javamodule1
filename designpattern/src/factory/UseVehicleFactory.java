package factory;

public class UseVehicleFactory {
	public static void main(String[] args) {
		vehicle seltos= VehicleFactor.newInstance("seltos");
		seltos.honk();
		vehicle suzuki= VehicleFactor.newInstance("Xcross");
		suzuki.move();
	}

}
