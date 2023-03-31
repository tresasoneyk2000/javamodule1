package factory;

public class VehicleFactor {
	public static vehicle newInstance(String car) {
		vehicle v= null;
		
		if(car==null) 
			return null;
		else if(car.equals("seltos"))
			v=new seltos();
		else if(car.equals("Xcross"))
			v=new Xcross();
		
		return v;
		
	}

}
