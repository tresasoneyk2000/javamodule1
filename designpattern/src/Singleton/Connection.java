package Singleton;

public class Connection {
	static Connection con;
	private Connection() {
		
	}
	public static Connection test() {
		if(con!=null) 
			return con;
		else 
			con= new Connection();
		return con;
		//return new Connection();
			
		
		
	}

}
