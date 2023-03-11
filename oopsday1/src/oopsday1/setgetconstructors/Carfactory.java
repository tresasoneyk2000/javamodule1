package oopsday1.setgetconstructors;

public class Carfactory {

	public static void main(String[] args) {
		Car c =new Car();
		// TODO Auto-generated method stub
         Car jag= new Car("yellow",900000,"honda","suv");
//         jag.setColour("red");
//         jag.setBrand("Jaguar");
//         jag.setModel("Premium sedan");
//         jag.setPrice(8000000);
         System.out.println(jag.hashCode());
         System.out.println(Integer.toHexString(jag.hashCode()));
         System.out.println(jag);
         System.out.println(jag.getColour());
         System.out.println(jag.getBrand());
         System.out.println(jag.getModel());
         System.out.println(jag.getPrice());
         
         
			/*
			 * jag.colour="black"; jag.price=9000000; jag.brand="BMW"; jag.model="SUV";
			 * 
			 * System.out.println( jag.colour); System.out.println(jag.price);
			 * System.out.println( jag.brand); System.out.println(jag.model);
			 */
         
         Car bmw= new Car("brown",5000000,"bmw","suv");
			/*
			 * bmw.colour="white"; bmw.price=7000000; bmw.brand="BMW";
			 * bmw.model="Highened sedan";
			 * 
			 * 
			 * System.out.println( bmw.colour); System.out.println(bmw.price);
			 * System.out.println( bmw.brand); System.out.println(bmw.model);
			 * 
			 */
         
//         bmw.setBrand("BMW");
//         bmw.setColour("white");
//         bmw.setModel("SUV");
//         bmw.setPrice(60000000);
         System.out.println(bmw.hashCode());
         System.out.println(Integer.toHexString(bmw.hashCode()));
         System.out.println(bmw);
         System.out.println(bmw.getBrand());
         System.out.println(bmw.getColour());
         System.out.println(bmw.getModel());
         System.out.println(bmw.getPrice());
         
         
	}

}
