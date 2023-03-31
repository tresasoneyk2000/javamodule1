package Singleton;

public class TestConnection {

	public static void main(String[] args) {
		
		
		for(int i=1;i<10;i++) {
			Connection con1=Connection.test();
			Connection con2=Connection.test();
//		System.out.println(con1);
//		System.out.println(con2);
		
		if(con1==con2) 
			System.out.println("Connection is singleton");
			
			else
				System.out.println("Connection is not singleton");
		}
		

	}

}
