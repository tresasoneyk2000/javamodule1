package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car jag= new Car();
         jag.colour="black";
         jag.price=9000000;
         jag.brand="BMW";
         jag.model="SUV";
         
         System.out.println( jag.colour);
         System.out.println(jag.price);
         System.out.println( jag.brand);
         System.out.println(jag.model);
         
         
         Car bmw= new Car();
         bmw.colour="white";
         bmw.price=7000000;
         bmw.brand="BMW";
         bmw.model="Highened sedan";
         
         
         System.out.println( bmw.colour);
         System.out.println(bmw.price);
         System.out.println( bmw.brand);
         System.out.println(bmw.model);
         
         
         
	}

}
